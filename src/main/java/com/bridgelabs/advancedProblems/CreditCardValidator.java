package com.bridgelabs.advancedProblems;
import java.util.*;
import java.util.regex.*;

public class CreditCardValidator {
    public static boolean isValidCardNumber(String cardNumber) {
        String visaPattern = "^4\\d{15}$";
        String masterCardPattern = "^5\\d{15}$";

        return Pattern.matches(visaPattern, cardNumber) || Pattern.matches(masterCardPattern, cardNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your credit card number:");
        String cardNumber = scanner.nextLine();

        if (isValidCardNumber(cardNumber)) {
            System.out.println("Valid Visa or MasterCard number.");
        } else {
            System.out.println("Invalid credit card number.");
        }
    }
}
/*
Enter your credit card number:
5212345678901234
Valid Visa or MasterCard number.

 */