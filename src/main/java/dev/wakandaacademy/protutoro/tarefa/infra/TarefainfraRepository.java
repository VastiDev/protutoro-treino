package dev.wakandaacademy.protutoro.tarefa.infra;

import org.springframework.stereotype.Repository;

import dev.wakandaacademy.protutoro.tarefa.application.repository.TarefaRepository;
import dev.wakandaacademy.protutoro.tarefa.domain.Tarefa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class TarefainfraRepository implements TarefaRepository {

	private final TarefaSpringMongoDBRepository tarefaSpringMongoDBRepository;

	@Override
	public Tarefa salva(Tarefa tarefa) {
		log.info("[start] TarefainfraRepository - salva");
		tarefaSpringMongoDBRepository.save(tarefa);
		log.info("[start] TarefainfraRepository - salva");		
		return tarefa;
	}

}
