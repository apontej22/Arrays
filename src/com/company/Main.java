package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("List of Supplies for a Coffe shop: \n");
        //array of supplies for a coffee shop
        String[] arrayOfSupplies = {"Coffee", "Sugar", "Coffe Creamer", "Cups", "Tea"};
        //to display the items on the supplies list
        for (String supplies : arrayOfSupplies){
            System.out.println(supplies);
        }
    }
}
