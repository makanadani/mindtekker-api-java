package br.com.fiap.mindtekker_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Document(collection = "devices")
public class Device implements UserDetails {

    @Id
    private String id;
    private String uuidDevice;
    private DeviceRole deviceRole;

    public Device() {
        this.deviceRole = DeviceRole.USER;
    }

    public Device(String id, String uuidDevice, DeviceRole deviceRole) {
        this.id = id;
        this.uuidDevice = uuidDevice;
        this.deviceRole = deviceRole;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuidDevice() {
        return uuidDevice;
    }

    public void setUuidDevice(String uuidDevice) {
        this.uuidDevice = uuidDevice;
    }

    public DeviceRole getDeviceRole() {
        return deviceRole;
    }

    public void setDeviceRole(DeviceRole deviceRole) {
        this.deviceRole = deviceRole;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return uuidDevice;
    }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }


}
