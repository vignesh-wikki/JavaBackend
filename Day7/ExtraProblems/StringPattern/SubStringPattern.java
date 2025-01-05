/*
 * 1.
Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
A substring is a contiguous sequence of characters within a string.
 
Example 1:
Input: patterns = ["a","abc","bc","d"], word = "abc"
Output: 3
Explanation:
- "a" appears as a substring in "abc".
- "abc" appears as a substring in "abc".
- "bc" appears as a substring in "abc".
- "d" does not appear as a substring in "abc".

 */

package Day7.ExtraProblems.StringPattern;

class SubStringPattern {
    public static int countStringPattern(String[] pattern, String word) {
        int count = 0;
        for (int i = 0; i < pattern.length; i++) {
            if (word.contains(pattern[i]))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String[] patterns = { "a", "abc", "bc", "d" };
        String word = "abc";
        System.out.println("Number of times substring matching with String is: "
                + countStringPattern(patterns, word));
    }
}