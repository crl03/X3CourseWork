package unit2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        ArrayList<Drink> drinkMenu = new ArrayList<>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.\n");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        System.out.println("\nCreating drink menu:");
        System.out.println("Please set the " + water + "\nDescription:");
        water.type();
        double drinkPrice = input.nextDouble();
        input.nextLine();
        water.setPrice(drinkPrice);

        System.out.println("Please set the " + soda + "\nDescription:");
        soda.type();
        drinkPrice = input.nextDouble();
        input.nextLine();
        soda.setPrice(drinkPrice);

        System.out.println("Please set the " + milk + "\nDescription:");
        milk.type();
        drinkPrice = input.nextDouble();
        input.nextLine();
        milk.setPrice(drinkPrice);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

//        System.out.println(cupcakeMenu);
//        System.out.println(drinkMenu);

        new Order(cupcakeMenu, drinkMenu);
    }
}