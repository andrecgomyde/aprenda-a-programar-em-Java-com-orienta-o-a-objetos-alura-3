package br.com.alura.buy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ************************             
                WELCOME TO CREDIT CARD!
                ************************
               """);

        System.out.println("Create a new account? Type 'yes' to continue or 'no' to end: ");
        String createAccount = scanner.nextLine();
        if (Objects.equals(createAccount, "yes")) {
            System.out.println("Let's create a new account!");
        } else {
            System.out.println("Ok, thanks!");
            return;
        }

        System.out.println("Please enter your full name:");
        String customerName = scanner.nextLine();
        System.out.println("Please enter your CPF number:");
        String customerCpf = scanner.nextLine();

        Customer customer = new Customer(customerName, customerCpf);

        System.out.println("Enter the card limit:");
        double cardLimit = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        CreditCard creditCard = new CreditCard(1234, "1234", cardLimit); // Card number and pass are hardcoded for simplicity

        while (true) {
            System.out.println("Enter the purchase description:");
            String description = scanner.nextLine();
            System.out.println("Enter the purchase amount:");
            double value = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            if (creditCard.makePurchase(description, value)) {
                System.out.println("Purchase made!");
            } else {
                System.out.println("Insufficient funds!");
                break;
            }

            System.out.println("Type '0' to exit or '1' to continue");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (option == 0) {
                break;
            }
        }

        ArrayList<Purchase> purchases = creditCard.getPurchases();
        purchases.sort(Comparator.comparingDouble(Purchase::getValue));

        System.out.println("\nPurchases Made:");
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }
        System.out.println("Card balance: " + creditCard.getBalance());

        System.out.println("\nProcess finished, thanks!");
    }
}
