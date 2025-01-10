package Day11.RegexExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    List<String> list = new ArrayList<>();

    public void addEmailsToList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of emails: ");
        int number = sc.nextInt();

        System.out.println("Enter the list of emails: ");

        for (int i = 0; i <= number; i++) {
            String email = sc.nextLine();
            list.add(email);
        }
        System.out.println("Emails are added...");
        System.out.println();
        sc.close();
    }

    public void validEmailChecker() {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9]+.(com|org|net)$");
        Matcher matcher = null;
        for (String email : list) {
            matcher = pattern.matcher(email);
            if (matcher.find())
                System.out.println(email + ": " + "Valid");
            else
                System.out.println(email + ": " + "Invalid");

        }
    }

    public static void main(String[] args) {
        Validation checkValid = new Validation();
        checkValid.addEmailsToList();
        checkValid.validEmailChecker();
    }

}
