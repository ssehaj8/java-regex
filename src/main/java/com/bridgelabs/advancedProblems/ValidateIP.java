package com.bridgelabs.advancedProblems;
import  java.util.regex.*;
import java.util.*;

public class ValidateIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter an IP address: ");
        String ipAddress = sc.nextLine();

        // Validate the IP address
        if (isValidIPv4(ipAddress)) {
            System.out.println("Valid IPv4 address.");
        } else {
            System.out.println("Invalid IPv4 address.");
        }

    }

    public static boolean isValidIPv4(String ip) {
        // Regular expression to match a valid IPv4 address
        String regex = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        return Pattern.matches(regex, ip);
    }
}
/*
Enter an IP address:
255.255.255.255
Valid IPv4 address.
 */