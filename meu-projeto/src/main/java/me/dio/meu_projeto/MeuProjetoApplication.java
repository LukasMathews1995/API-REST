package me.dio.meu_projeto;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import me.dio.meu_projeto.domain.model.Pokemon;
import me.dio.meu_projeto.domain.model.PokemonElement;


@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class MeuProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuProjetoApplication.class, args);
		
		
	}

}
