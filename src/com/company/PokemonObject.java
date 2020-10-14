package com.company;

import java.util.Arrays;

public class PokemonObject {


    public static void main(String[] args) {
        PokemonClass pokemon1 = new PokemonClass("Balbassaur", "leaf", "water");
        PokemonClass pokemon2 = new PokemonClass("Pikatchu", "electric", "water");
        PokemonClass pokemon3 = new PokemonClass("Charizard", "fire", "leaf");
        PokemonClass pokemon4 = new PokemonClass("Squirtle", "water", "fire");
        PokemonClass pokemon5 = new PokemonClass("Kingler", "water", "fire");
        PokemonClass pokemon6 = new PokemonClass("Odish", "leaf", "water");


       PokemonClass[] AshPokemons = new PokemonClass[5];
        AshPokemons[0] = pokemon1;
        AshPokemons[1] = pokemon2;
        AshPokemons[2] = pokemon3;
        AshPokemons[3] = pokemon4;
        AshPokemons[4] = pokemon5;

        choosePokemon(AshPokemons,pokemon6);
    }
    public static void choosePokemon(PokemonClass[] ashPokemon, PokemonClass enemy){
        for (int i = 0; i < ashPokemon.length; i++) {
            if (ashPokemon[i].isEffectiveAgainst(enemy)){
                System.out.println(ashPokemon[i].name);
            }
        }
    }
}
