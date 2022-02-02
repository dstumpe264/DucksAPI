package com.stump.ducks;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stump.ducks.repository.DuckRepository;

@SpringBootApplication
public class DucksApplication {

	public static void main(String[] args) {
		SpringApplication.run(DucksApplication.class, args);
		
		
	}


}
