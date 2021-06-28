package com.company;

public class Animal {
    int legs;
    String size;
    boolean isFixed;
    String name;
    String hair;

    public Animal(int legs, String size, boolean isFixed, String name, String hair){
        this.legs = legs;
        this.size = size;
        this.isFixed = isFixed;
        this.name = name;
        this.hair = hair;
    }

    public static void Speak(){
        System.out.println("---");
    }
 public String toString(){
        return "Legs: " + legs + " Size: " + size + " Fixed?: " + isFixed + " Name: " + name + " Hair: " + hair;
 }
}
