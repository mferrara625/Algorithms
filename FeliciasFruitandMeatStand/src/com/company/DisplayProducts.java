package com.company;

import java.util.List;
public class DisplayProducts {

    public static void DisplayProducts(List<Product> list, String type) {
        for (Product product : list) {
            if (product instanceof Meat && type == "Meat") {
                System.out.println(product);
            } else if (product instanceof Fruit && type == "Fruit") {
                System.out.println(product);
            }
        }
    }
}
