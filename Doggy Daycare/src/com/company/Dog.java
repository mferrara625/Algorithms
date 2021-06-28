package com.company;

public class Dog extends Animal{
    String breed;
    String snoutLength;
    String faveToy;

    public Dog(int legs, String size, boolean isFixed, String name, String hair, String breed, String snoutLength, String faveToy) {
        super(legs, size, isFixed, name, hair);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.faveToy = faveToy;

    }

    public static void Speak(){
        System.out.println("woof");
    }
    public String toString(){
        return "Legs: " + legs + " Size: " + size + " Fixed?: " + isFixed + " Name: " + name + " Hair: " + hair + " Breed: " + breed + " Snout Length: " + snoutLength + " Favorite Toy: " + faveToy;
    }
}
