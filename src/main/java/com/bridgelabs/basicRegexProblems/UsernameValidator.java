package com.bridgelabs.basicRegexProblems;
import java.util.*;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9]{4,14}$";
        return Pattern.matches(regex, username);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a username: ");
        String username= sc.nextLine();

        if(isValidUsername(username)){
            System.out.println(username+" username entered is valid");
        }
        else{
            System.out.println(username+" username entered is invalid");
        }
    }
}
/*
Enter a username:
sehaj08
sehaj08 username entered is valid
 */