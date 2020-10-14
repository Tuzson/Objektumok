package com.company;

public class PokemonClass {
    String name;
    String type;
    String effectiveAgainst;

    public PokemonClass(String name, String type, String effectiveAgainst){
        this.name = name;
        this.type = type;
        this.effectiveAgainst = effectiveAgainst;
    }
    public boolean isEffectiveAgainst(PokemonClass pokemon){
        if (this.effectiveAgainst.equals(pokemon.type)){
            return true;

        }return false;
    }
}
