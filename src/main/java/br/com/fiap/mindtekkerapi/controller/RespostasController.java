package br.com.fiap.mindtekkerapi.controller;

import br.com.fiap.mindtekkerapi.dto.RespostaExibicaoDTO;
import br.com.fiap.mindtekkerapi.service.RespostasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/respostas")
public class RespostasController {

    @Autowired
    private RespostasService respostasService;

    @PostMapping("/salvar/{idPergunta}/{valorResposta}")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaExibicaoDTO salvarResposta(@PathVariable Long idPergunta, @PathVariable int valorResposta) {
        return respostasService.salvarResposta(idPergunta, valorResposta);
    }
}
