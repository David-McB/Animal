package com.animal;

import com.animalClass.AnimalClass;
import com.animalClass.MammalMovement;

public abstract class Animal {
    private String name;
    private String species;
    private AnimalClass animalClass;
    private int averageLifespan;
    private boolean isSocial;

    private boolean producesMilk;

    private String favouriteFood;

    public Animal(String name, String species, AnimalClass animalClass, int averageLifespan, boolean isSocial, String favouriteFood, boolean producesMilk) {
        this.name = name;
        this.species = species;
        this.animalClass = animalClass;
        this.averageLifespan = averageLifespan;
        this.isSocial = isSocial;
        this.favouriteFood = favouriteFood;
    }

    public Animal() {
        this("Unknown", "Unknown", AnimalClass.UNKNOWN, 0, false, "unknown", false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public AnimalClass getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(AnimalClass animalClass) {
        this.animalClass = animalClass;
    }

    public int getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(int averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public boolean isSocial() {
        return isSocial;
    }

    public void setSocial(boolean social) {
        isSocial = social;
    }

    public boolean producesMilk() {
        return producesMilk;
    }

    public boolean setProducesMilk(boolean milk) {
        return producesMilk = milk;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

//    public abstract void eat(String favouriteFood);

    public String eat() {
        return this.getSpecies() + " " + this.getName() + " ate" + this.getFavouriteFood();
    }

    public abstract String move(MammalMovement movement);

}
