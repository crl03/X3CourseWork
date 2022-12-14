package unit2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Order {
    private ArrayList<Cupcake> cupcakeMenu;
    private ArrayList<Drink> drinkMenu;

    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {

        System.out.println("Hello, would you like to place an order? (Y or N)");
        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        ArrayList<Object> order = new ArrayList<>() {
            @Override
            public String toString() {
                String orderReceipt = "Receipt\n";
                for (int i = 0; i < this.size(); i++) {
                    if (i < 2) {
                        orderReceipt += this.get(i).toString() + "\n";
                    } else {
                        orderReceipt += this.get(i).toString();
                    }
                }
                return orderReceipt;
            }
        };

        if (placeOrder.equalsIgnoreCase("Y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());

            System.out.println("CUPCAKES");
            int itemNumber = 0;
            for (int i = 0; i < cupcakeMenu.size(); i++) {
                itemNumber++;
                System.out.printf("Number:\t%d\t%s\n", itemNumber, cupcakeMenu.get(i));
            }

            System.out.println("DRINKS");
            for (int i = 0; i < drinkMenu.size(); i++) {
                itemNumber++;
                System.out.printf("Number:\t%d\t%s\n", itemNumber, drinkMenu.get(i));
            }

            boolean ordering = true;
            boolean validOrder = true;
            int orderChoice = 0;
            double orderTotal = 0;
            String continueOrder;

            while (ordering) {
                System.out.println("What would you like to order?  Please use associated Numbers.");

                do {
                    try {
                        orderChoice = input.nextInt();
                        input.nextLine();
                            validOrder = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please input valid number.");
                        input.nextLine();
                        validOrder = false;
                    }
                } while (!validOrder);

                switch (orderChoice){
                    case 1:
                        order.add(cupcakeMenu.get(0));
                        cupcakeMenu.get(0).type();
                        orderTotal += cupcakeMenu.get(0).getPrice();
                        break;
                    case 2:
                        order.add(cupcakeMenu.get(1));
                        cupcakeMenu.get(1).type();
                        orderTotal += cupcakeMenu.get(1).getPrice();
                        break;
                    case 3:
                        order.add(cupcakeMenu.get(2));
                        cupcakeMenu.get(2).type();
                        orderTotal += cupcakeMenu.get(2).getPrice();
                        break;
                    case 4:
                        order.add(drinkMenu.get(0));
                        drinkMenu.get(0).type();
                        orderTotal += drinkMenu.get(0).getPrice();
                        break;
                    case 5:
                        order.add(drinkMenu.get(1));
                        drinkMenu.get(1).type();
                        orderTotal += drinkMenu.get(1).getPrice();
                        break;
                    case 6:
                        order.add(drinkMenu.get(2));
                        drinkMenu.get(2).type();
                        orderTotal += drinkMenu.get(2).getPrice();
                        break;
                    default:
                        System.out.println("Sorry that's not on the menu.");
                }
                System.out.println("\t\t\t\t\t\t\t\t\t" + "Sub Total: " + orderTotal);
                System.out.println("Would you like another item? (Y or N)");
                continueOrder = input.nextLine();
                if (continueOrder.equalsIgnoreCase("N")) {
                    for (Object item: order) {
                        System.out.println(item);
                    }
                    System.out.println("Your order total is: $" + orderTotal + "\nHave a nice day!\n\n");
                    ordering = false;
                }
            }
            new CreateFile();
            new WriteToFile(order, orderTotal);

        } else {
            System.out.println("Have a nice day!");
        }


    }
}
