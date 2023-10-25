package com.animalClass;

import com.animalClass.AnimalClass;
import com.animal.Animal;

public abstract class Mammal extends Animal {

    public Mammal(String name, String species, AnimalClass animalClass, int averageLifespan, boolean isSocial,
                  String favouriteFood, boolean producesMilk) {
        super(name, species, animalClass, averageLifespan, isSocial, favouriteFood, producesMilk);
        this.setProducesMilk(true);
    }

    @Override
    public String move(MammalMovement movement) {
        return "This animal's movement is " + movement;
    }



}
