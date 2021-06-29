package com.company;

public class Meat extends Product{

        public String boneless;
        public Meat (String name, int amtSold, int cost, String type, String boneless) {
            super(name, amtSold, cost, type);
            this.boneless = boneless;
        }
        public String toString(){
            return "Felicia sold " + amtSold + " " + boneless + " " +  name + " for $" + cost + " each, for a total of $" + (amtSold * cost) + ".";
        }
}
