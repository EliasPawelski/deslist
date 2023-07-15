package com.projetoaula.deslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoaula.deslist.dto.GameMinDTO;
import com.projetoaula.deslist.entities.Game;
import com.projetoaula.deslist.repositories.GameRepository;

@Service
public class GamerService {
	 
    @Autowired
    private GameRepository gameRepository;
    
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}
}
