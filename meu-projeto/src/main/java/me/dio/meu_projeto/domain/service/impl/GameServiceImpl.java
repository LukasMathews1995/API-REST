package me.dio.meu_projeto.domain.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.meu_projeto.domain.model.Game;
import me.dio.meu_projeto.domain.repository.GameRepository;
import me.dio.meu_projeto.domain.service.GameService;

@Service
public class GameServiceImpl implements GameService{
		private final GameRepository gameRepository;
		public GameServiceImpl (GameRepository gameRepository) {
			this.gameRepository = gameRepository;
		}
		
		
	@Override
	public Game findById(Long id) {
	
		return gameRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Game create(Game gameToCreate) {
		if(gameToCreate.getPlayerHome().getId()== gameToCreate.getPlayerOpp().getId() ) {
		throw new IllegalArgumentException ("This game has the same person to fight with");
		}
		if(gameRepository.existsById(gameToCreate.getId())) {
			throw new IllegalArgumentException ("This game already exists");
		}
		return gameRepository.save(gameToCreate);
	}

}
