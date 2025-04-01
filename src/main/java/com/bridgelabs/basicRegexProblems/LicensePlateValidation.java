package com.bridgelabs.basicRegexProblems;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LicensePlateValidation {
    public static boolean isValidLicensePlate(String LicensePlate){
        String regex="^[A-Z]{2}\\d{4}$";
        return Pattern.matches(regex, LicensePlate);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a license plate number: ");
        String LicensePlate = sc.nextLine(); // Read user input

        if (isValidLicensePlate(LicensePlate)) {
            System.out.println( LicensePlate + " is a valid license plate.");
        } else {
            System.out.println(LicensePlate + " is an invalid license plate.");
        }

    }
}
/*
Enter a license plate number: SP0812
SP0812 is a valid license plate.

 */