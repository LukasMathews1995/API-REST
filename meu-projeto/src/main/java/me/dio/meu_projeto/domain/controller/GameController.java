package me.dio.meu_projeto.domain.controller;

import java.net.URI;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.meu_projeto.domain.model.Game;
import me.dio.meu_projeto.domain.service.GameService;

@RestController
@RequestMapping("/users")
public class GameController {
	private final GameService gameService;
	
	public GameController(GameService gameService) {
		this.gameService = gameService;
	}
	@GetMapping("/{id}")
	public ResponseEntity<Game> findById(@PathVariable Long id){
		var game = gameService.findById(id);
		return ResponseEntity.ok(game);
		
	}
	@PostMapping
	public ResponseEntity<Game> create(@RequestBody Game game){
		var gameCreated = gameService.create(game);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(game.getId()).toUri();
		return ResponseEntity.created(location).body(gameCreated);
		
	}
	
	

}
