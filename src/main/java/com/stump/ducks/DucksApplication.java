package com.stump.ducks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.stump.ducks.entity.Duck;
import com.stump.ducks.repository.DuckRepository;

@SpringBootApplication
public class DucksApplication {



	private static final Logger log = LoggerFactory.getLogger(DucksApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DucksApplication.class);
	}

	@Bean
	public CommandLineRunner demo(DuckRepository repository) {
		return (args) -> {


			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Duck duck : repository.findAll()) {
				log.info(duck.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Duck duck = repository.findById(6l);
			log.info("Customer found with findById(1):");
			log.info("--------------------------------");
			log.info(duck.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByName("Duck Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			log.info("");
		};
	}


}
