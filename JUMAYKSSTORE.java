/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jumayks.store;

import java.util.Scanner;

public class JUMAYKSSTORE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean main = true;
        while (main == true) {
            System.out.println("Welcome to Jumayks ice cream shop");
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to buy ice cream?");
            String response = scan.next();
            main = false;
            boolean check = false;
            double totalcost = 0;

            while (response.equalsIgnoreCase("yes")) {

                System.out.println("""
                                   
                                    FLAVOR \t  PRICE\t BARCODE
                                    Mocha \t   30  \t   1 
                                    Choco \t   25  \t   2
                                    Vanilla\t   20  \t   3
                                    Mango \t   35  \t   4
                                    Ube \t   28  \t   5 """);
                System.out.println();
                System.out.println("15% Discount for 500.00 Php worth of purchase!!!");

                System.out.println("Input barcode number:");

                int input2 = scan.nextInt();
                double price = 0;
                String productName = "";

                switch (input2) {
                    case 1 -> {
                        price = 30;
                        productName = "Mocha";
                        check = true;
                    }
                    case 2 -> {
                        price = 25;
                        productName = "Choco";
                        check = true;
                    }
                    case 3 -> {
                        price = 20;
                        productName = "Vanilla";
                        check = true;
                    }
                    case 4 -> {
                        price = 35;
                        productName = "Mango";
                        check = true;
                    }
                    case 5 -> {
                        price = 28;
                        productName = "Ube";
                        check = true;
                    }
                }
                if (check == true) {
                    System.out.println("You selected: " + productName + "\n cost: PHP " + price + "\n Enter quantity:");
                    double quantity = scan.nextDouble();
                    double subtotal = price * quantity;
                    totalcost += subtotal;
                    System.out.println("Subtotal: " + quantity + "*" + price + " = PHP " + subtotal);

                    System.out.println("    Would you like to purchase another item? (yes/no)");
                    response = scan.next();

                }
                double discount = 0.15;
                double totaldis = 0;
                double total = 0;

                if (totalcost > 500) {
                    totaldis = totalcost * discount;
                    total = totalcost - totaldis;
                    System.out.println();
                    System.out.println("YOU HAVE SUCCESSFULLY ATTAINED 15% DISCOUNT");
                } else {
                    total = totalcost;
                }
                if (response.equalsIgnoreCase("no")) {
                    System.out.println("Overall total: PHP " + total);

                    double payment = 0;

                    do {
                        System.out.println();
                        System.out.println("Please enter the amount of money to pay: ");
                        payment = scan.nextDouble();

                        if (payment < total) {
                            System.out.println("Insufficient funds. You need at least PHP " + (total - payment) + " more.");
                        } else {
                            double change = payment - total;
                            System.out.println("Payment accepted. Your change is PHP " + change);
                        }
                    } while (payment < total);
                    main = true;
                    System.out.println("-------------------------------------------------");
                }
            }
        }
    }
}
