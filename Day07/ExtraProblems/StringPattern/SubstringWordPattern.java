/*
 * For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
Given strings sequence and word, return the maximum k-repeating value of word in sequence.
 
Example 1:
Input: sequence = "ababc", word = "ab"
Output: 2
Explanation: "abab" is a substring in "ababc".

 */

package Day07.ExtraProblems.StringPattern;

public class SubstringWordPattern {
    public static int MaximumRepeatingSubstring(String sequence, String word) {
        int count = 0;
        for (int i = 0; i < sequence.length() - word.length(); i++) {
            if (sequence.substring(i, i + word.length()).equals(word))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ba";
        System.out.println("Maximum Repeating Substring is: "
                + MaximumRepeatingSubstring(sequence, word));
    }
}
