package com.company;
import java.util.ArrayList;
import java.util.List;

public class DayCare {

    public static void addAnimal(List<Animal> list, Animal animal){
        list.add(animal);
    }
    public static void displayAnimals(List<Animal> list) {
        for (Animal animal : list) {
            if (animal instanceof Dog) {
                System.out.println("Dog Class! " + animal);
            }
            if (animal instanceof Cat) {
                System.out.println("Cat Class! " + animal);
            }

        }
    }
    public static void removeAnimal(List<Animal> list, String name){
        list.removeIf(animal -> animal.name.equals(name));
    }
}
