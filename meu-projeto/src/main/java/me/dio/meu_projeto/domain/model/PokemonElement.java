package me.dio.meu_projeto.domain.model;

public enum PokemonElement {
	FIRE("fogo"), WATER("agua") , EARTH("terra"), AIR("ar") , PYSHICAL("físico");
	
	private String element;
	
	PokemonElement(String element){
		this.element = element;
	}

	public String getElement() {
		return element;
	}

	
	
	

}
