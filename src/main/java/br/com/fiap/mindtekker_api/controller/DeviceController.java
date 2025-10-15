package br.com.fiap.mindtekker_api.controller;

import br.com.fiap.mindtekker_api.model.Device;
import br.com.fiap.mindtekker_api.repository.DeviceRepository;
import br.com.fiap.mindtekker_api.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping("/salvar/{uuid}")
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@PathVariable String uuid) {
        deviceService.salvarDevice(uuid);
    }
}
