package dev.wakandaacademy.protutoro.tarefa.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.protutoro.tarefa.application.api.TarefaIdResponse;
import dev.wakandaacademy.protutoro.tarefa.application.api.TarefaRequest;
import dev.wakandaacademy.protutoro.tarefa.application.repository.TarefaRepository;
import dev.wakandaacademy.protutoro.tarefa.domain.Tarefa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class TarefaApplicationService implements TarefaService {

	private final TarefaRepository tarefaRepository;

	@Override
	public TarefaIdResponse criaNovaTarefa(TarefaRequest tarefaRequest) {
		log.info("[start] TarefaApplicationService - criaNovaTarefa");
		Tarefa tarefaCriada = tarefaRepository.salva(new Tarefa(tarefaRequest));
		log.info("[finish] TarefaApplicationService - criaNovaTarefa");
		return TarefaIdResponse.builder().idTarefa(tarefaCriada.getIdTarefa()).build();
		
	}

}
