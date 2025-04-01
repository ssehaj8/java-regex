package com.bridgelabs.basicRegexProblems;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return Pattern.matches(regex, username);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = sc.nextLine();

        if (isValidUsername(username)) {
            System.out.println(username + "' is a valid username.");
        } else {
            System.out.println(username + "' is an invalid username.");
        }
    }
}
