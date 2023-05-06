package dev.wakandaacademy.protutoro.usuario.application.service;

import javax.validation.Valid;

import dev.wakandaacademy.protutoro.usuario.application.API.UsuarioCriadoResponse;
import dev.wakandaacademy.protutoro.usuario.application.API.UsuarioNovoRequest;

public interface UsuarioApplicationService {

	UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo);
	
}
