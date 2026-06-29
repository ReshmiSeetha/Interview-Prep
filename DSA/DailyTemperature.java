package DSA;

import java.util.Stack;
public class DailyTemperature {
    public static void main(String args[]){
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] res = dailyTemperatures(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] dailyTemperatures(int[] arr){
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<arr.length;i++){
            // If today's temperature is warmer than the temperature
            // at the index on the top of the stack,
            // then today is the answer for that earlier day
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                int prevIndex = stack.pop();
                ans[prevIndex] = i-prevIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}
