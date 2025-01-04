package Day5.JavaLangClasses.Strings;

import java.util.Scanner;

public class StringEx {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String sentence = scanner.nextLine();
                String[] words = sentence.trim().split("\\s+");
                int wordLength = words.length;
                System.out.println("Number of words: " + wordLength);
                StringBuilder reversed = new StringBuilder(sentence);
                System.out.println("Reversed sentence: " + reversed.reverse());
                String vowel = sentence.replaceAll("[AEIOUaeiou]", "*");
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
