/*
 * For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
Given strings sequence and word, return the maximum k-repeating value of word in sequence.
 
Example 1:
Input: sequence = "ababc", word = "ab"
Output: 2
Explanation: "abab" is a substring in "ababc".
 */

package Day7.ExtraProblems.StringPattern;

public class Palindrome {
    public boolean validPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return checkPalindrome(str, left + 1, right) || checkPalindrome(str, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean checkPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String str = "abc";
        System.out.println("Number of times substring matching with String is: "
                + palindrome.validPalindrome(str));
    }

}
