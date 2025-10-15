package br.com.fiap.mindtekker_api.dto;

import br.com.fiap.mindtekker_api.model.Respostas;

import java.time.LocalDate;

public record RespostaExibicaoDTO(
        String idDevice,
        String idResposta,
        Long idPergunta,
        int valorResposta,
        LocalDate dataRegistro
) {
    public RespostaExibicaoDTO(Respostas resposta) {
        this(
                resposta.getIdDispositivo(),
                resposta.getIdResposta(),
                resposta.getIdPergunta(),
                resposta.getValorResposta(),
                resposta.getDataRegistro()
        );
    }
}
