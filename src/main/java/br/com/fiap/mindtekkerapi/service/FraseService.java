package br.com.fiap.mindtekkerapi.service;

import br.com.fiap.mindtekkerapi.dto.FraseExibicaoDTO;
import br.com.fiap.mindtekkerapi.model.Frase;
import br.com.fiap.mindtekkerapi.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    public FraseExibicaoDTO sortearFrase() {
        Random random = new Random();
        Long numero = random.nextLong(100) + 1;
        Optional<Frase> fraseSorteada = fraseRepository.findById(numero);
        return new FraseExibicaoDTO(fraseSorteada.get());
    }
}

