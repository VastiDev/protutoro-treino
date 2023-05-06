package dev.wakandaacademy.protutoro.pomodoro.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.protutoro.pomodoro.domain.ConfiguracaoPadrao;
@Service
public class PomodoroService implements PomodoroApplicationService {

	@Override
	public ConfiguracaoPadrao getConfiguracaoPadrao() {
		//TODO IMPLEMENTAR BUSCA DAS CONFIG NO MONGO
		return ConfiguracaoPadrao.builder()
				.tempoMinutosFoco(25)
				.tempoMinutosPausaCurta(5)
				.tempoMinutosPausaLonga(15)
				.repeticoesParaPausaLonga(3).build();	
		
	}
}
