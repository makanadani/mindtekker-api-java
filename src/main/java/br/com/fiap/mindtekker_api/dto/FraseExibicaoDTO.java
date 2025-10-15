package br.com.fiap.mindtekker_api.dto;


import br.com.fiap.mindtekker_api.model.Frase;

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
