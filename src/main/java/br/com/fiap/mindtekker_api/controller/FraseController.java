package br.com.fiap.mindtekker_api.controller;

import br.com.fiap.mindtekker_api.dto.FraseExibicaoDTO;
import br.com.fiap.mindtekker_api.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class FraseController {

    @Autowired
    private FraseService fraseService;

    @GetMapping("/sortear")
    @ResponseStatus(HttpStatus.OK)
    public FraseExibicaoDTO sortear() {
        return fraseService.sortearFrase();
    }
}
