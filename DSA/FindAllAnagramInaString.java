package DSA;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramInaString {
    public static void main(String args[]){
        String s="cbaebabacd";
        String p="abc";
        System.out.print(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s, String p){
        int m = p.length();
        int n = s.length();
        List<Integer> result  = new ArrayList<>();

        if(m > n)
            return result;

        int[] need = new int[26];
        int[] window = new int[26];

        for(int i = 0; i < m; i++){
            need[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        if(matches(need, window))
            result.add(0);
        for(int right = m; right < n; right ++){
            window[s.charAt(right) - 'a']++;
            window[s.charAt(right - m) - 'a']--;

            if(matches(need, window))
               result.add(right - m + 1);
        }
        return result;
    }
    public static boolean matches(int[] a, int[] b){
        for(int i =0; i < 26; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}
