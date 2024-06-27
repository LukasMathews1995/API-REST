package me.dio.meu_projeto.domain.model;
import jakarta.persistence.*;


@Entity(name= "tb_pokemon")
public class Pokemon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	@Column(nullable=false,unique = true)
private String name;
	@Column(nullable=false, precision = 1)
private int evolutionLevel;
	@Column(nullable=false)
private String color;
	@Column(nullable=false)
private PokemonElement element;


public Pokemon (String name, int evolutionLevel, String color, PokemonElement element) {
	this.name= name;
	this.evolutionLevel = evolutionLevel;
	this.color = color;
	this.element = element;
	
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEvolutionLevel() {
	return evolutionLevel;
}
public void setEvolutionLevel(int evolutionLevel) {
	this.evolutionLevel = evolutionLevel;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}


public PokemonElement getElement() {
	return element;
}


public void setElement(PokemonElement element) {
	this.element = element;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}

}
