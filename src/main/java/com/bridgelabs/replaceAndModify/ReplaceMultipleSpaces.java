package com.bridgelabs.replaceAndModify;
import java.util.*;
import  java.util.regex.*;

public class ReplaceMultipleSpaces {
    public  static void main(String[] args){
        System.out.println("Enter a sentence with multiple spaces:");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        String result= str.replaceAll("\\s+", " ");

        System.out.println("Output: ");
        System.out.println(result);

    }
}
/*
Enter a sentence with multiple spaces:
This is an example with multiple spaces
Output:
This is an example with multiple spaces

 */