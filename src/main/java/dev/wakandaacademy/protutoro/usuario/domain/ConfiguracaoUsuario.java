package dev.wakandaacademy.protutoro.usuario.domain;

import dev.wakandaacademy.protutoro.pomodoro.domain.ConfiguracaoPadrao;
import lombok.Getter;


@Getter
public class ConfiguracaoUsuario {
	
	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurta;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesParaPausaLonga;
	
	public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrao) {
		this.tempoMinutosFoco = configuracaoPadrao.getTempoMinutosFoco();
		this.tempoMinutosPausaCurta = configuracaoPadrao.getTempoMinutosPausaCurta();
		this.tempoMinutosPausaLonga = configuracaoPadrao.getTempoMinutosPausaLonga();
		this.repeticoesParaPausaLonga = configuracaoPadrao.getRepeticoesParaPausaLonga();
	}
}