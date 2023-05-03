package dev.wakandaacademy.protutoro.tarefa.application.api;

import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.protutoro.tarefa.application.service.TarefaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
public class TarefaRestController implements TarefaAPI{
	
	private final TarefaService tarefaService;

	@Override
	public TarefaIdResponse postNovaTarefa(TarefaRequest tarefaRequest) {
		log.info("[start] TarefaRestController - postNovaTarefa");
		TarefaIdResponse tarefaCriada = tarefaService.criaNovaTarefa(tarefaRequest);
		log.info("[finish] TarefaRestController - postNovaTarefa");
		return tarefaCriada;
	}

}
