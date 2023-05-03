package dev.wakandaacademy.protutoro.tarefa.application.service;

import dev.wakandaacademy.protutoro.tarefa.application.api.TarefaIdResponse;
import dev.wakandaacademy.protutoro.tarefa.application.api.TarefaRequest;

public interface TarefaService {

	TarefaIdResponse criaNovaTarefa(TarefaRequest tarefaRequest);
}
