package me.dio.meu_projeto.domain.model;
import jakarta.persistence.*;

@Entity(name= "tb_corporation")
public class Corporation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false,unique = true)
	private String name;
	@Column(name = "capacityTotal" ,nullable = false , unique = true , precision = 7)
	private int capacity;
	@Column(nullable = false,unique = true)
	private String tournaments;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getTournaments() {
		return tournaments;
	}
	public void setTournaments(String tournaments) {
		this.tournaments = tournaments;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
