package br.com.fiap.mindtekker_api.service;

import br.com.fiap.mindtekker_api.dto.FraseExibicaoDTO;
import br.com.fiap.mindtekker_api.model.Frase;
import br.com.fiap.mindtekker_api.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public FraseExibicaoDTO sortearFrase() {
        Aggregation agg = Aggregation.newAggregation(Aggregation.sample(1));
        AggregationResults<Frase> results = mongoTemplate.aggregate(agg, "frase", Frase.class);
        Frase frase = results.getUniqueMappedResult();

        if (frase == null) {
            throw new NoSuchElementException("Nenhuma frase cadastrada");
        }
        return new FraseExibicaoDTO(frase);
    }
}



