package DSA;

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class NextGreaterElementI {
	public static void main(String[] args){
		int[] arr1 = {4,1,2};
		int[] arr2 ={1,3,4,2};
        int[] res = nextGreaterElement(arr1,arr2);
        for(int i=0;i<res.length;i++){
                    System.out.print(res[i]+" ");
        } 
    }
    public static int[] nextGreaterElement(int[] nums1,int[] nums2){
        // Stores: number -> its next greater element
        Map<Integer,Integer> map = new HashMap<>();
        // Monotonic decreasing stack
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums1.length];

        // Traverse nums2 from left to right
        for(int num:nums2){
            // If current num is greater than stack top,
            // then current num is the next greater element
            // for all smaller elements on the stack top.
            while(!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(),num);
            }
            // Push current number to wait for its next greater element
            stack.push(num);
        }
        // Elements left in the stack do not have any greater element
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        // For each nums1 element, directly fetch answer from map
        for(int i =0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}

