package com.bridgelabs.extractionProblems;
import java.util.regex.*;
import java.util.*;

public class LinkExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input text
        System.out.println("Enter a sentence containing links:");
        String str = sc.nextLine(); // Read user input

        String regex = "https?://[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)+(?:/[a-zA-Z0-9%_.-]*)*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        List<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group());
        }

        if (links.isEmpty()) {
            System.out.println("No links found.");
        } else {
            System.out.println("Extracted Links:");
            links.forEach(System.out::println);
        }
    }
}

/*
Enter a sentence containing links:
Visit https://www.google.com and http://example.org for more info
Extracted Links:
https://www.google.com
http://example.org
 */