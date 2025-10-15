package br.com.fiap.mindtekker_api.repository;

import br.com.fiap.mindtekker_api.model.Respostas;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

public interface RespostasRepository extends MongoRepository<Respostas, String> {

    List<Respostas> findByIdDispositivoAndIdPerguntaBetweenOrderByDataRegistroDesc(
            String idDispositivo, Long startId, Long endId
    );
}
