package br.com.fiap.mindtekker_api.repository;

import br.com.fiap.mindtekker_api.model.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DeviceRepository extends MongoRepository<Device, String> {

    boolean existsByUuidDevice(String uuidDevice);

    Optional<Device> findByUuidDevice(String uuid);

}
