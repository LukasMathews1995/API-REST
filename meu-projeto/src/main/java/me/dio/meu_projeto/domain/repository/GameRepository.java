package me.dio.meu_projeto.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.meu_projeto.domain.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {

}
