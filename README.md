# Pokémon REST API Client

A Spring Boot application that communicates with the PokéAPI and outputs details about a specific pokemon. The selection is specified by the integer id parameter at the end of the URL header. For example, "https://pokeapi.co/api/v2/pokemon/1" will output information about Bulbasaur whose id is 1. Ids range from 1 to 1118. Connection is made possible through the implementation of Java and the RestTemplate Spring library.
