package br.com.fiap.mindtekker_api.repository;

import br.com.fiap.mindtekker_api.model.Frase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FraseRepository extends MongoRepository<Frase, String> {
}
