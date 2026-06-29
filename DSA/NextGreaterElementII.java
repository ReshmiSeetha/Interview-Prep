package DSA;

import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElementII {
    public static void main(String args[]){
        int[] arr = {4,5,2,25};
        int[] res = nextGreaterElement(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] nextGreaterElement(int[] arr){
        int n =arr.length;
        int ans[] = new int[n];

        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 2*n -1; i>=0;i--){
            int index = i%n;
            while(!stack.isEmpty() &&  stack.peek() <=arr[index])
                stack.pop();
            if(i<n){
                if(!stack.isEmpty()){
                    ans[index]=stack.peek();
                }else{
                    ans[index]=-1;
                }
            }
            stack.push(arr[index]);
        }
        return ans;

    }
}
