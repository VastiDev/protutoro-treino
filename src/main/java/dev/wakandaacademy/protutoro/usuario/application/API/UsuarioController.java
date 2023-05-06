package dev.wakandaacademy.protutoro.usuario.application.API;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.protutoro.usuario.application.service.UsuarioApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Validated
@RestController
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI {

	private final UsuarioApplicationService usuarioApplicationService;

	@Override
	public UsuarioCriadoResponse postNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[start] UsuarioController -  postNovoUsuario");
		UsuarioCriadoResponse usuarioCriado = usuarioApplicationService.criaNovoUsuario(usuarioNovo);
		log.info("[finish] UsuarioController -  postNovoUsuario");
		return usuarioCriado;
	}
}
