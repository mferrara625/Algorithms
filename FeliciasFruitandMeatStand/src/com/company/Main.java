package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Fruit("Apples", 25, 2, "Fruit","non seedless"));
        productList.add(new Fruit("Oranges", 20, 3, "Fruit","seedless"));
        productList.add(new Fruit("Grapes", 18, 4,"Fruit", "seedless"));
        productList.add(new Meat("Chicken Breasts", 16, 6, "Meat", "boneless"));
        productList.add(new Meat("Pork Chops", 24, 5, "Meat","non boneless"));
        productList.add(new Meat("Chicken Thighs", 12, 3, "Meat","non boneless"));
            System.out.println(displayProducts(productList));
            DisplayProducts.DisplayProducts(productList, "Meat");
            System.out.println(displayProduct(productList, 3));

        }
        public static String displayProducts(List list){
                return list.toString();
        }

        public static String displayProduct(List<Product> list, int num) {
             return String.valueOf(list.get(num).name);
        }

    }


