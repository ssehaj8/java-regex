package com.bridgelabs.advancedProblems;
import java.util.*;
import java.util.regex.*;

public class SSNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an SSN: ");
        String ssn = sc.nextLine();

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);

        if (matcher.matches()) {
            System.out.println( ssn + " is a valid SSN.");
        } else {
            System.out.println( ssn + " is an invalid SSN.");
        }
    }
}
/*
Enter an SSN:
123-45-6789
123-45-6789 is a valid SSN.

 */