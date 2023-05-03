package dev.wakandaacademy.protutoro.tarefa.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TarefaIdResponse {
	private UUID idTarefa;
}
