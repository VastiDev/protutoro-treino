package dev.wakandaacademy.protutoro.usuario.application.API;

import java.util.UUID;

import dev.wakandaacademy.protutoro.usuario.domain.StatusUsuario;
import dev.wakandaacademy.protutoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.Value;


@Value
@RequiredArgsConstructor
public class UsuarioCriadoResponse {
	private final UUID idUsuario;
	private final String email;
	private final ConfiguracaoUsuarioResponse configuracao;
	private StatusUsuario status = StatusUsuario.FOCO;
	private final Integer quantidadePomodorosPausaCurta = 0;
	
	public UsuarioCriadoResponse(Usuario usuario) {
		this.idUsuario = usuario.getIdUsuario();
		this.email = usuario.getEmail();
		this.configuracao = new ConfiguracaoUsuarioResponse(usuario.getConfiguracao());
		this.status = usuario.getStatus();
	}
}

