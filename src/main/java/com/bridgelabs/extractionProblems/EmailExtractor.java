package com.bridgelabs.extractionProblems;
import java.util.regex.*;
import java.util.*;
public class EmailExtractor {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter text containing email addresses:");
        String str= sc.nextLine();

        String regex= "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(str);

            List<String> emails =new ArrayList<>();
            while (matcher.find()){
                emails.add(matcher.group());
            }

            if(emails.isEmpty()){
                System.out.println("No email addresses found");
            }
            else {
                System.out.println("Extracted email addresses: ");
                for (String email : emails){
                    System.out.println(email);
                }
            }

    }
}
/*
Enter text containing email addresses:
Contact us at support@example.com and info@company.or
Extracted email addresses:
support@example.com
info@company.or

 */