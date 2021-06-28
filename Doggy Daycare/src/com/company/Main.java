package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    List<Animal> animalList = new ArrayList<Animal>();

    Dog spot = new Dog(4, "Large", false, "Spot","Bald", "Mixed","Short", "Bone");
    spot.Speak();
    Cat jerry = new Cat(3, "Extra Medium",true,"Jerry","Blonde","Polka dots",false,true);
    jerry.Speak();
    DayCare.addAnimal(animalList, jerry);
    DayCare.addAnimal(animalList, spot);
    DayCare.displayAnimals(animalList);
        DayCare.removeAnimal(animalList, "Spot");
        System.out.println("AFTER REMOVAL:");
        DayCare.displayAnimals(animalList);

    }
}
