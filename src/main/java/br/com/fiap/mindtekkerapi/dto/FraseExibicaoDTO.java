package br.com.fiap.mindtekkerapi.dto;

import br.com.fiap.mindtekkerapi.model.Frase;

public record FraseExibicaoDTO(
        String frase,
        String autor
) {
    public FraseExibicaoDTO(Frase frase) {
        this(
               frase.getFrase(),
                frase.getAutor()
        );
    }
}
