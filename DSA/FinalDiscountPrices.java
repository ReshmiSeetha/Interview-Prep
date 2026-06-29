package DSA;

import java.util.Stack;

public class FinalDiscountPrices {
    public static void main(String args[]){
        int[] arr = {8,4,6,2,3};
        int[] res = finalPrices(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i =n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>prices[i]){
                stack.pop();
            }
            int discount = stack.isEmpty()?0:stack.peek();
            ans[i] = prices[i]-discount;
            stack.push(prices[i]);
        }
        return ans;
    }
}
