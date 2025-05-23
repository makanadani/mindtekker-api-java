package br.com.fiap.mindtekkerapi.dto;

import br.com.fiap.mindtekkerapi.model.Respostas;

import java.time.LocalDate;
import java.util.Date;

public record RespostaExibicaoDTO(
        Long idResposta,
        Long idPergunta,
        int valorResposta,
        LocalDate dataRegistro
) {
    public RespostaExibicaoDTO(Respostas resposta) {
        this(
                resposta.getIdResposta(),
                resposta.getIdPergunta(),
                resposta.getValorResposta(),
                resposta.getDataRegistro()
        );
    }
}
