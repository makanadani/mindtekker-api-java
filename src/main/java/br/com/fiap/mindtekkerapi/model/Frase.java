package br.com.fiap.mindtekkerapi.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TB_FRASES")
public class Frase {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TB_FRASES_SEQ"
    )
    @SequenceGenerator(
            name = "TB_FRASES_SEQ",
            sequenceName = "TB_FRASES_SEQ",
            allocationSize = 1
    )
    private Long id;

    private String frase;
    private String autor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Frase frase1 = (Frase) o;
        return Objects.equals(id, frase1.id) && Objects.equals(frase, frase1.frase) && Objects.equals(autor, frase1.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, frase, autor);
    }
}
