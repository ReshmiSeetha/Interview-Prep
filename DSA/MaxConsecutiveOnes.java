package DSA;

public class MaxConsecutiveOnes {
    public static void main(String args[]){
        int[] arr={1,1,0,1,1,1};
        int res=findMaxConsecutiveOnes(arr);
        System.out.print(res);
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int left = 0;
        int best = 0;
        
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                left = right + 1;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
