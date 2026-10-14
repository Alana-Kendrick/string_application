package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String item = "pasta";
        double itemPrice = 3.59;
        int quantity = 7;
        double total = itemPrice * quantity;
        System.out.println("You bought " + quantity + " " + item + "s for $" + total + ".");
    }
}
