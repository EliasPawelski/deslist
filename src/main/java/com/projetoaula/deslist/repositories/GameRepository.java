package com.projetoaula.deslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoaula.deslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {
	
}
