package br.com.fiap.mindtekkerapi.service;

import br.com.fiap.mindtekkerapi.dto.RespostaExibicaoDTO;
import br.com.fiap.mindtekkerapi.model.Respostas;
import br.com.fiap.mindtekkerapi.repository.RespostasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RespostasService {

    @Autowired
    private RespostasRepository respostasRepository;

    public RespostaExibicaoDTO salvarResposta(Long IdPergunta, int valorResposta) {
        Respostas resposta = new Respostas();
        resposta.setIdPergunta(IdPergunta);
        resposta.setValorResposta(valorResposta);
        LocalDate dataAtual = LocalDate.now();
        resposta.setDataRegistro(dataAtual);

        Respostas respostaSalva = respostasRepository.save(resposta);
        return new RespostaExibicaoDTO(respostaSalva);
    }
}
