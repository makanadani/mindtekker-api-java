package br.com.fiap.mindtekker_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "respostas")
public class Respostas {

    @Id
    private String idResposta;
    private String idDispositivo;
    private Long idPergunta;
    private int valorResposta;
    private LocalDate dataRegistro;

    public Respostas() {}

    public Respostas(String idResposta, String idDispositivo, Long idPergunta, int valorResposta, LocalDate dataRegistro) {
        this.idResposta = idResposta;
        this.idDispositivo = idDispositivo;
        this.idPergunta = idPergunta;
        this.valorResposta = valorResposta;
        this.dataRegistro = dataRegistro;
    }

    public String getIdResposta() {
        return idResposta;
    }

    public void setIdResposta(String idResposta) {
        this.idResposta = idResposta;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public Long getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(Long idPergunta) {
        this.idPergunta = idPergunta;
    }

    public int getValorResposta() {
        return valorResposta;
    }

    public void setValorResposta(int valorResposta) {
        this.valorResposta = valorResposta;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
