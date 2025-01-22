/*1) Write a program that takes a sentence as input from the user and performs the following operations:
Count the number of words in the sentence.
Reverse the entire sentence.
Replace all vowels in the sentence with the character '*'.
2) Write a program that:
Takes two strings as input from the user.
Compares them lexicographically using compareTo() method.
Checks if the two strings are equal (case-sensitive and case-insensitive).
Concatenates the two strings and prints the result.
 */

package Day06.JavaLangClasses.Strings;

import java.util.Scanner;

public class StringEx {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                String[] words = str.trim().split("\\s+");
                int wordLength = words.length;
                System.out.println("Number of words: " + wordLength);
                StringBuilder reversed = new StringBuilder(str);
                System.out.println("Reversed sentence: " + reversed.reverse());
                String vowel = str.replaceAll("[AEIOUaeiou]", "*");
                System.out.println("Replacing vowels: " + vowel);

                System.out.println("Enter the first string:");
                String str1 = scanner.nextLine();

                System.out.println("Enter the second string:");
                String str2 = scanner.nextLine();

                int comparisonResult = str1.compareTo(str2);
                System.out.println("compareTo: " + comparisonResult);

                boolean Equal = str1.equals(str2);
                System.out.println("Case-sensitive: " + Equal);
                boolean EqualIgnoreCase = str1.equalsIgnoreCase(str2);
                System.out.println("Case-insensitive: " + EqualIgnoreCase);

                String joined = str1 + str2;
                System.out.println("Joined string: " + joined);

                scanner.close();
        }

}
