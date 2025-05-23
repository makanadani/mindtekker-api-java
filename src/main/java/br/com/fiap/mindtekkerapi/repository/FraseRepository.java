package br.com.fiap.mindtekkerapi.repository;

import br.com.fiap.mindtekkerapi.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}
