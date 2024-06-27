package me.dio.meu_projeto.domain.service;

import me.dio.meu_projeto.domain.model.Game;

public interface GameService  {
	Game findById(Long id);
	Game create(Game gameToCreate);
	

}
