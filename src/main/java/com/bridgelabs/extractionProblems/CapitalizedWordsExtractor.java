package com.bridgelabs.extractionProblems;
import java.util.regex.*;
import java.util.*;

public class CapitalizedWordsExtractor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String str= sc.nextLine();

        String regex="\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        List<String> capitalizedWords = new ArrayList<>();
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }
        if (capitalizedWords.isEmpty()) {
            System.out.println("No capitalized words found.");
        } else {
            System.out.println("Extracted Capitalized Words:");
            for (String capitalizedWord: capitalizedWords){
                System.out.println(capitalizedWord);
            }
        }


    }
}
/*
Enter the Sentence:
"The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
Extracted Capitalized Words:
The
Eiffel
Tower
Paris
Statue
Liberty
New
York
 */