package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Players;
import com.example.demo.repository.playersrepository;

@RestController
public class playerscontroller {
	@Autowired
	private playersrepository repository;

	@PostMapping("/addPlayer")
	public String savePlayers(@RequestBody Players players) {
		repository.save(players);
		return "Added players with id : " + players.getId();
	}

	@GetMapping("/findAllPlayers")
	public List<Players> getPlayers() {
		return repository.findAll();
	}

	@GetMapping("/findAllPlayers/{id}")
	public Optional<Players> getPlayers(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deletePlayers(@PathVariable int id) {
		repository.deleteById(id);
		return "players deleted with id : " + id;
	}
	
	@PutMapping("/players")	
    public Players updateEmployee(@RequestBody  Players players) {
    	
    	
    	repository.save(players);
	   return players;
    
    }

}
