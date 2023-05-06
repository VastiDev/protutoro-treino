package dev.wakandaacademy.protutoro.usuario.domain;

import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.Email;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import dev.wakandaacademy.protutoro.pomodoro.domain.ConfiguracaoPadrao;
import dev.wakandaacademy.protutoro.usuario.application.API.UsuarioNovoRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Usuario")
@Getter
public class Usuario {
	
	@Id
	private UUID idUsuario;
	@Email
	@Indexed(unique = true)
	private String email;
	private ConfiguracaoUsuario configuracao;
	@Builder.Default
	private StatusUsuario status = StatusUsuario.FOCO;
	@Builder.Default
	private Integer quantidadePomodorosPausaCurta = 0;
	
	public Usuario(@Valid UsuarioNovoRequest usuarioNovo, ConfiguracaoPadrao configuracaoPadrao) {
		this.idUsuario = UUID.randomUUID();
		this.email = usuarioNovo.getEmail();
		this.status = StatusUsuario.FOCO;
		this.configuracao = new ConfiguracaoUsuario(configuracaoPadrao);
	}
}
