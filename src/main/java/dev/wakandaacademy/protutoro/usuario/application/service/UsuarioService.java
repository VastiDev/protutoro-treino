package dev.wakandaacademy.protutoro.usuario.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.protutoro.credencial.application.service.CredencialApplicationService;
import dev.wakandaacademy.protutoro.pomodoro.application.service.PomodoroApplicationService;
import dev.wakandaacademy.protutoro.usuario.application.API.UsuarioCriadoResponse;
import dev.wakandaacademy.protutoro.usuario.application.API.UsuarioNovoRequest;
import dev.wakandaacademy.protutoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class  UsuarioService implements UsuarioApplicationService {

	private final PomodoroApplicationService pomodoroservice;
	private final CredencialApplicationService credencialService;
	private final UsuarioRepository usuarioRepository;

	@Override
	public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[start] UsuarioService - criaNovoUsuario");
		var configuracaoPadrao = pomodoroservice.getConfiguracaoPadrao();
		credencialService.criaNovaCredencial(usuarioNovo);
		var usuario = new Usuario(usuarioNovo, configuracaoPadrao);
		usuarioRepository.salva(usuario);
		log.info("[finish] UsuarioService - criaNovoUsuario");
		return new UsuarioCriadoResponse(usuario);
	}
}
