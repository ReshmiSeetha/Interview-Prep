package DSA;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String args[]){
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        );
        int res=minimumTotal(arr);
        System.out.print(res);
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new  int[n+1];
        for(int i = n-1; i >=0; i--){
            List<Integer> row = triangle.get(i);
            for(int j = 0; j < row.size(); j++){
                dp[j] = row.get(j) + Math.min(dp[j], dp[j+1]);
            }
        }
        return dp[0];
    }
}
