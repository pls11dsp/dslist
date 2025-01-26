package com.dspcontroles.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dspcontroles.dslist.dto.GameListDTO;
import com.dspcontroles.dslist.dto.GameMinDTO;
import com.dspcontroles.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
			
	@GetMapping
	public List<GameListDTO> filndAll(){
		List<GameListDTO> result = gameListService.findAll();
	    return result;
	}

}
