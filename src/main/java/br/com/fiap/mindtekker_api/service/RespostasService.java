package br.com.fiap.mindtekker_api.service;

import br.com.fiap.mindtekker_api.dto.RespostaExibicaoDTO;
import br.com.fiap.mindtekker_api.model.Respostas;
import br.com.fiap.mindtekker_api.repository.RespostasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.core.FindAndModifyOptions;


import java.time.LocalDate;
import java.util.List;

@Service
public class RespostasService {

    @Autowired
    private RespostasRepository respostasRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public RespostaExibicaoDTO salvarOuAtualizarResposta(String idDevice, Long idPergunta, int valorResposta) {
        LocalDate hoje = LocalDate.now(); // só o dia, sem hora

        Query query = new Query();
        query.addCriteria(Criteria.where("idDispositivo").is(idDevice)
                .and("idPergunta").is(idPergunta)
                .and("dataRegistro").is(hoje));

        Update update = new Update();
        update.set("valorResposta", valorResposta);
        update.set("dataRegistro", hoje);

        Respostas resposta = mongoTemplate.findAndModify(
                query,
                update,
                FindAndModifyOptions.options().upsert(true).returnNew(true),
                Respostas.class
        );

        return new RespostaExibicaoDTO(resposta);
    }

    public List<RespostaExibicaoDTO> listarRespostas() {
        List<Respostas> respostas = respostasRepository.findAll();
        return respostas.stream().map(RespostaExibicaoDTO::new).toList();
    }

    public List<RespostaExibicaoDTO> listarRespostasForms(String uuidDevice, Long idPerguntaInicial, Long idPerguntaFinal) {
        return respostasRepository.findByIdDispositivoAndIdPerguntaBetweenOrderByDataRegistroDesc(uuidDevice, idPerguntaInicial, idPerguntaFinal).stream().map(RespostaExibicaoDTO::new).toList();
    }
}
