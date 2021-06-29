package com.company;

public class Fruit extends Product{

    public String seedless;
    public Fruit(String name, int amtSold, int cost, String type, String seedless) {
        super(name, amtSold, cost, type);
        this.seedless = seedless;
    }
    public String toString(){
        return "Felicia sold " + amtSold + " " + seedless + " " +  name + " for $" + cost + " each, for a total of $" + (amtSold * cost) + ".";
    }
}
