package br.com.fiap.mindtekkerapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "TB_RESPOSTAS")
public class Respostas {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tb_respostas_id_resposta_seq"
    )
    @SequenceGenerator(
            name = "tb_respostas_id_resposta_seq",
            sequenceName = "tb_respostas_id_resposta_seq",
            allocationSize = 1
    )
    @Column(name = "id_resposta")
    private Long idResposta;

    @Column(name = "id_pergunta")
    private Long idPergunta;

    @Column(name = "valor_resposta")
    private int valorResposta;

    @Column(name = "data_registro")
    private LocalDate dataRegistro;

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

    public Long getIdResposta() {
        return idResposta;
    }

    public void setIdResposta(Long idResposta) {
        this.idResposta = idResposta;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
