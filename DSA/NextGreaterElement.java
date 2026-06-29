package DSA;

import java.util.Stack;
public class NextGreaterElement {
    public static void main(String args[]){
        int[] arr = {4,5,2,25};
        int[] res = nextGreaterElement(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[]nextGreaterElement(int[] arr){
        int[] res = new int[arr.length];
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();    
            for(int i = n-1; i >=0; i--){
                while(!stack.empty() && arr[i] >= stack.peek()){
                    stack.pop();
                }
                res[i]=stack.isEmpty()? -1:stack.peek();
                stack.push(arr[i]);
            }
        return res;
}
}
