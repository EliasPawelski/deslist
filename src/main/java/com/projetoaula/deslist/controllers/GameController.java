package com.projetoaula.deslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoaula.deslist.dto.GameMinDTO;
import com.projetoaula.deslist.services.GamerService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
    @Autowired
	private GamerService gameService;
    
    @GetMapping
	public List<GameMinDTO>findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
