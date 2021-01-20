package com.delvin.ortiz.pokemonapiclient;

import com.delvin.ortiz.pokemonapiclient.model.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;

import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class PokemonapiclientApplication {

	private static final Logger log = LoggerFactory.getLogger(PokemonapiclientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PokemonapiclientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{

		return args -> {

			Pokemon pokemon = restTemplate.getForObject(
				"https://pokeapi.co/api/v2/pokemon/1", Pokemon.class
			);

			log.info(pokemon.toString());

		};
	}
}
