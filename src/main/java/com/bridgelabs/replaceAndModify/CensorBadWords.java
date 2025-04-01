package com.bridgelabs.replaceAndModify;
import java.util.*;
public class CensorBadWords {
    public static void main(String[] args){
        List <String> badwords= Arrays.asList("damn", "stupid");

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String str= sc.nextLine();

        String regex="\\b(" + String.join("|", badwords) + ")\\b";

        String result = str.replaceAll(regex, "****");

        System.out.println("Censored Sentence:");
        System.out.println(result);
    }
}
/*
Enter the sentence:
This is a damn bad example with some stupid words
Censored Sentence:
This is a **** bad example with some **** words

 */