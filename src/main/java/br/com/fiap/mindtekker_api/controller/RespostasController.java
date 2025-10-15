package br.com.fiap.mindtekker_api.controller;

import br.com.fiap.mindtekker_api.dto.RespostaExibicaoDTO;
import br.com.fiap.mindtekker_api.service.RespostasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostasController {

    @Autowired
    private RespostasService respostasService;

    @PostMapping("/salvar/{idDevice}/{idPergunta}/{valorResposta}")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaExibicaoDTO salvarResposta(
            @PathVariable String idDevice,
            @PathVariable Long idPergunta,
            @PathVariable int valorResposta) {
        return respostasService.salvarOuAtualizarResposta(idDevice, idPergunta, valorResposta);
    }

    @GetMapping("/respostas/{uuid}/{idPergunta}/{idPerguntaFinal}")
    @ResponseStatus(HttpStatus.OK)
    public List<RespostaExibicaoDTO> listaRespostas(@PathVariable String uuid, @PathVariable Long idPergunta, @PathVariable Long idPerguntaFinal) {
        return respostasService.listarRespostasForms(uuid, idPergunta, idPerguntaFinal);
    }
}
