package dev.wakandaacademy.protutoro.credencial.application.service;

import javax.validation.Valid;

import dev.wakandaacademy.protutoro.usuario.application.API.UsuarioNovoRequest;

public interface CredencialApplicationService {

	void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);

}
