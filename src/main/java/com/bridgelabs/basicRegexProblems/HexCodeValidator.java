package com.bridgelabs.basicRegexProblems;
import java.util.regex.*;
import java.util.*;
public class HexCodeValidator {
    public static boolean isHexCodeValid(String HexCode){
        String regex="^#([A-Fa-f0-9]{6})$";
        return Pattern.matches(regex,HexCode);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hex color code: ");
        String HexCode = sc.nextLine(); // Read user input

        if (isHexCodeValid(HexCode)) {
            System.out.println(HexCode + " is a valid hex color.");
        } else {
            System.out.println(HexCode+ " is an invalid hex color.");
        }

    }
}
/*
Enter a hex color code: #FFA500
#FFA500 is a valid hex color.

 */