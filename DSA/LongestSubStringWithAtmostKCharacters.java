package DSA;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithAtmostKCharacters {
    public static void main(String args[]){
        String s="eceba";
        int k=2;
        int res=lengthOfLongestSubstringKDistinct(s,k);
        System.out.print(res);
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        // Implementation for finding the longest substring with at most k distinct characters
        if(k == 0 || s.length() == 0) {
            return 0;
        }
        int left = 0;
        int best = 0;

        Map<Character, Integer> count = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);

            while(count.size() > k){
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);

                if(count.get(leftChar) == 0){
                    count.remove(leftChar);
                }
                left ++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
