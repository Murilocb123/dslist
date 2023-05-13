package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

/*
 *Responsavel por realizar operações basicas no banco de dados (busca por id)
 **/

public interface GameRepository extends JpaRepository<Game, Long>{

}
