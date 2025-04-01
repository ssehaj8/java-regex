package com.bridgelabs.extractionProblems;
import java.util.regex.*;
import java.util.*;

public class DateExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence containing dates in dd/mm/yyyy format:");
        String str = sc.nextLine();

        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        List<String> dates = new ArrayList<>();

        while (matcher.find()) {
            dates.add(matcher.group());
        }

        if (dates.isEmpty()) {
            System.out.println("No dates found.");
        } else {
            System.out.println("Extracted Dates:");
            dates.forEach(System.out::println);
        }
    }
}
/*
Enter a sentence containing dates in dd/mm/yyyy format:
The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020
Extracted Dates:
12/05/2023
15/08/2024
29/02/2020

 */
