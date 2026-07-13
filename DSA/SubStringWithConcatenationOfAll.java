package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SubStringWithConcatenationOfAll {
    public static void main(String args[]){
        String s="barfoothefoobarman";
        String[] words={"foo","bar"};
        System.out.print(findSubstring(s,words));
    }
    public static List<Integer> findSubstring(String s, String[] words){
        List<Integer> results = new ArrayList<>();
        if(words == null || words.length == 0 || s== null || s.length() ==0){
            return results;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;
        int n = s.length();

        if(totalLen > n){
            return results;
        }

        Map<String, Integer> need = new HashMap<>();
        for(String word : words){
            need.put(word, need.getOrDefault(word, 0) + 1);
        }

        for(int offSet = 0; offSet < wordLen; offSet++){
            int left = offSet;
            int count = 0;

            Map<String, Integer> window = new HashMap<>();
            for(int right = offSet; right + wordLen <= n; right+= wordLen){
                String word = s.substring(right, right+wordLen);

                if(!need.containsKey(word)){
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }
                window.put(word, window.getOrDefault(word, 0) +1);
                count++;

                while(window.get(word) > need.get(word)){
                    String leftWord = s.substring(left, left + wordLen );
                    window.put(leftWord, window.get(leftWord) -1);
                    count--;
                    left+=wordLen;
                }
                if(count == wordCount){
                    results.add(left);

                    String leftWord = s.substring(left, left + wordLen);
                    window.put(leftWord, window.get(leftWord) -1);
                    count--;
                    left+=wordLen;
                }
            }
        }
        return results;
    }
}
