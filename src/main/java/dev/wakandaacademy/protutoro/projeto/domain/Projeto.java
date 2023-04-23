package dev.wakandaacademy.protutoro.projeto.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Projeto")
@Getter
public class Projeto {
	@Id
	private UUID idProjeto;
	private String email;
	private String descricao;
	@Indexed
	private UUID idUsuario;
	@Indexed
	private UUID area;

}
