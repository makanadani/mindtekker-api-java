package br.com.fiap.mindtekker_api.controller;

import br.com.fiap.mindtekker_api.config.security.TokenService;
import br.com.fiap.mindtekker_api.dto.TokenDTO;
import br.com.fiap.mindtekker_api.model.Device;
import br.com.fiap.mindtekker_api.repository.DeviceRepository;
import br.com.fiap.mindtekker_api.service.DeviceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private DeviceRepository deviceRepository;

    @PostMapping("/login/{uuid}")
    public ResponseEntity<TokenDTO> login(@PathVariable String uuid) {
        Device device = deviceRepository.findByUuidDevice(uuid)
                .orElseThrow(() -> new RuntimeException("Device não encontrado"));

        String token = tokenService.gerarTokenDevice(device);
        return ResponseEntity.ok(new TokenDTO(token));
    }
}
