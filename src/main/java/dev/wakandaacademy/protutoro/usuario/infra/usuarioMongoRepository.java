package dev.wakandaacademy.protutoro.usuario.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.wakandaacademy.protutoro.usuario.domain.Usuario;

public interface usuarioMongoRepository extends MongoRepository<Usuario, UUID>{

}
