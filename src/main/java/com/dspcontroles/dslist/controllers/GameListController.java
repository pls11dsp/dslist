package com.dspcontroles.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dspcontroles.dslist.dto.GameListDTO;
import com.dspcontroles.dslist.dto.GameMinDTO;
import com.dspcontroles.dslist.services.GameListService;
import com.dspcontroles.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
			
	@GetMapping
	public List<GameListDTO> filndAll(){
		List<GameListDTO> result = gameListService.findAll();
	    return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> filndById(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
	    return result;
	}

}
