package DSA.StringExamples;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentLetter = s.charAt(right);
            if (charIndexMap.containsKey(currentLetter) &&
                    charIndexMap.get(currentLetter) >= left) {
                left = charIndexMap.get(currentLetter) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            charIndexMap.put(currentLetter, right);
        }
        return maxLength;
    }
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // public int lengthOfLongestSubstring(String s) {
    // int maxLength = 0;
    // for (int i = 0; i < s.length(); i++) {
    // StringBuilder currentSubString = new StringBuilder();
    // System.out.println("i is " + i);
    // for (int j = i; j < s.length(); j++) {
    // System.out.println("j is " + j);
    // System.out.println("Current Sub String is " + currentSubString);
    // System.out.println("Current Index of " + s.charAt(j) + " is "
    // + currentSubString.indexOf(String.valueOf(s.charAt(j))));
    // if (currentSubString.indexOf(String.valueOf(s.charAt(j))) != -1) {
    // break;
    // } else {
    // currentSubString.append(s.charAt(j));
    // maxLength = Math.max(maxLength, currentSubString.length());
    // }
    // }
    // }
    // return maxLength;
    // }

    public static void main(String[] args) {
        LengthOfLongestSubString lengthOfLongestSubString = new LengthOfLongestSubString();
        System.out.println(lengthOfLongestSubString.lengthOfLongestSubstring("abcabcbb"));
    }
}
