package com.stump.ducks.controller;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stump.ducks.entity.Duck;
import com.stump.ducks.repository.DuckRepository;

@RestController
public class MainController {
	@Autowired
	private DuckRepository duckRepository;
	
	MainController(DuckRepository duckRepository){
		this.duckRepository = duckRepository;
		
		Scanner sc = new Scanner(System.in);
		String name;

		while (true) {
			System.out.println("Add a duck?");
			if(sc.nextLine().equals("y")) {
				System.out.println("Full Name: ");
				name = sc.nextLine();
				newDuck(name);
			} else {
				break;
			}
			
		}
	}
	
	Duck newDuck(String name) {
		Duck d = new Duck(name);
		return duckRepository.save(d);
	}
	
	
	
//	// Get all Ducks
//	@GetMapping(path="/ducks")
//	Iterable<Duck> all(){
//		return duckRepository.findAll();
//	}
//	
//	@PostMapping(path="/ducks")
//	Duck newDuck(@RequestBody Duck newDuck) {
//		return duckRepository.save(newDuck);
//	}
//	
//	@GetMapping(path="ducks/{id}")
//	Optional<Duck> one(@PathVariable Integer id) {
//		return duckRepository.findById(id);
////				.orElseThrow(() -> new DuckNotFoundException(id));
//	}
	
	
	@GetMapping(path="/ping")
	public @ResponseBody String ping() {
		return "pong";
	}
}
