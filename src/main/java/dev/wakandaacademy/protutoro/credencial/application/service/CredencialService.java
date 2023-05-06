package dev.wakandaacademy.protutoro.credencial.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.protutoro.usuario.application.API.UsuarioNovoRequest;
@Service
public class CredencialService implements CredencialApplicationService {
	@Override
	public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {
	}
}
