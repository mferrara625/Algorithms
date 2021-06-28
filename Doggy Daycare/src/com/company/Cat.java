package com.company;

public class Cat extends Animal {
    String pattern;
    boolean wasStray;
    boolean doublePawed;

    public Cat(int legs, String size, boolean isFixed, String name, String hair, String pattern, boolean wasStray, boolean doublePawed) {
        super(legs, size, isFixed, name, hair);
        this.pattern = pattern;
        this.wasStray = wasStray;
        this.doublePawed =doublePawed;

    }
    public static void Speak(){
        System.out.println("meow");
    }
    public String toString(){
        return "Legs: " + legs + " Size: " + size + " Fixed?: " + isFixed + " Name: " + name + " Hair: " + hair + " Pattern: " + pattern + " Was Stray?: " + wasStray + " Double Pawed?: " + doublePawed;
    }
}
