package dev.wakandaacademy.protutoro.tarefa.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.wakandaacademy.protutoro.tarefa.domain.Tarefa;

public interface TarefaSpringMongoDBRepository extends MongoRepository<Tarefa, UUID> {

}
