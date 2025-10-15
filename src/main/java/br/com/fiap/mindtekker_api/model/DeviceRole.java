package br.com.fiap.mindtekker_api.model;

public enum DeviceRole {

    USER("user");

    private String role;

    DeviceRole(String role) {this.role = role;}

    String getRole() {return role;}

    void setRole(String role) {this.role = role;}

}



