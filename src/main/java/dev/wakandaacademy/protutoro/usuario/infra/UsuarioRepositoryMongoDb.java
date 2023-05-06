package dev.wakandaacademy.protutoro.usuario.infra;

import org.springframework.stereotype.Repository;

import dev.wakandaacademy.protutoro.usuario.application.service.UsuarioRepository;
import dev.wakandaacademy.protutoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryMongoDb implements UsuarioRepository {
	private final usuarioMongoRepository usuarioMongoRepository;

	@Override
	public Usuario salva(Usuario usuario) {
		return usuarioMongoRepository.save(usuario);
	}

}
