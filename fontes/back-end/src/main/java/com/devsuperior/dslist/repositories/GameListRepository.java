package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;

/*
 *Responsavel por realizar operações basicas no banco de dados (busca por id)
 **/

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
