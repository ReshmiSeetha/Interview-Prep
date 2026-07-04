package DSA;

import java.util.Deque;
import java.util.ArrayDeque;
public class MaximumSlidingWindow {
    public static void main(String args[]){
        int[] arr ={1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow(arr,k);
        for(int i=0;i<res.length;i++){  
            System.out.print(res[i]+" ");
        }
    }
    public static int[] maxSlidingWindow(int[] nums,int k){
        if(nums == null || nums.length ==0 || k ==0){
            return new int[0];
        }
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        int idx=0;
        for(int i =0;i<n;i++){
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i>=k-1){
                ans[idx++]=nums[deque.peekFirst()];
            }
        }
        return ans;
    }
    
}
