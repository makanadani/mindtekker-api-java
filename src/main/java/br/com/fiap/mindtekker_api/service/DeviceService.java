package br.com.fiap.mindtekker_api.service;

import br.com.fiap.mindtekker_api.model.Device;
import br.com.fiap.mindtekker_api.model.DeviceRole;
import br.com.fiap.mindtekker_api.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public void salvarDevice(String uuidDevice) { //vai tentar salvar o device, se tiver ja, ignora, se nao cria outro
        if(!deviceRepository.existsByUuidDevice(uuidDevice)) {
            Device device = new Device();
            device.setUuidDevice(uuidDevice);
            deviceRepository.save(device);
        }
    }
}
