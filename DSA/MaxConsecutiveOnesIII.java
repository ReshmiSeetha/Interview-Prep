package DSA;

public class MaxConsecutiveOnesIII {
    public static void main(String args[]){
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int res=longestOnes(arr,k);
        System.out.print(res);
    }

    public static int longestOnes(int[] nums, int k){
        int left = 0;
        int zeroCount = 0;
        int best = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCount++;
            }

            if(zeroCount > k){
                if(nums[left] ==0){
                    zeroCount--;
                }
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
