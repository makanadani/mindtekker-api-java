package br.com.fiap.mindtekkerapi.controller;

import br.com.fiap.mindtekkerapi.dto.FraseExibicaoDTO;
import br.com.fiap.mindtekkerapi.model.Frase;
import br.com.fiap.mindtekkerapi.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
