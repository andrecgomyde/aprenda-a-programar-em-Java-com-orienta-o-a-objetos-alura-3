package br.com.alura.buy;

import java.util.ArrayList;

public class CreditCard {
    private int number;
    private String pass;
    private double limit;
    private double balance;
    private ArrayList<Purchase> purchases;

    public CreditCard(int number, String pass, double limit) {
        this.number = number;
        this.pass = pass;
        this.limit = limit;
        this.balance = limit;
        this.purchases = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }

    public boolean makePurchase(String description, double value) {
        if (balance >= value) {
            purchases.add(new Purchase(description, value));
            balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Card number: " + number;
    }
}
