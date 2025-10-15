package br.com.fiap.mindtekker_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "frases")
public class Frase {
    @Id
    private String id;
    private String frase;
    private String autor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
