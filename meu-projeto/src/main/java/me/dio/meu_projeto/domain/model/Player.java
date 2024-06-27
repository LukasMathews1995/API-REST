package me.dio.meu_projeto.domain.model;
import jakarta.persistence.*;

@Entity(name= "tb_player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	
private String name;
	@Column(nullable=false)
private int age;
	@Column(nullable=false)
private String playTime;
	@Column(nullable=false)
private int score;
	@Column(nullable=false)
private int level;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPlayTime() {
	return playTime;
}
public void setPlayTime(String playTime) {
	this.playTime = playTime;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}


}
