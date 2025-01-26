package com.dspcontroles.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dspcontroles.dslist.dto.GameDTO;
import com.dspcontroles.dslist.dto.GameMinDTO;
import com.dspcontroles.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO filndById(@PathVariable Long id){
	    GameDTO result = gameService.findById(id);
	    return result;
	}
	
	@GetMapping
	public List<GameMinDTO> filndAll(){
		List<GameMinDTO> result = gameService.findAll();
	    return result;
	}

}
