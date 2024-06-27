package me.dio.meu_projeto.domain.model;

import java.util.List;

import jakarta.persistence.*;


@Entity(name= "tb_game")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String gameName;
	@OneToOne(cascade= CascadeType.ALL)
	private Player playerOpp;
	@OneToOne(cascade= CascadeType.ALL)
	private Player playerHome;
	
	@OneToMany(cascade= CascadeType.ALL, fetch =FetchType.EAGER)
	private List<Pokemon> pokemon;
	
	@OneToOne(cascade= CascadeType.ALL)
	private Corporation corporation;
	
	
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public Player getPlayerOpp() {
		return playerOpp;
	}
	public void getPlayerOpp(Player playerOpp) {
		this.playerOpp = playerOpp;
	}
	

	public Corporation getCorporation() {
		return corporation;
	}
	public void setCorporation(Corporation corporation) {
		this.corporation = corporation;
	}
	public Player getPlayerHome() {
		return playerHome;
	}
	public void setPlayerHome(Player playerHome) {
		this.playerHome = playerHome;
	}
	public List<Pokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(List<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setPlayerOpp(Player playerOpp) {
		this.playerOpp = playerOpp;
	}
	

}
