package DSA;

public class LeftAndRightSumDiff {
    public static void main(String args[]){
        int[] arr={10,4,8,3};
        int res[]=leftRightSumDiff(arr);
       for(int i=0;i<res.length;i++){  
            System.out.print(res[i]+" ");
        }
    }
    public static int[] leftRightSumDiff(int[] nums){
        int n=nums.length;
        int total=0;
        int ans[] = new int[n];
        for(int num:nums){
            total += num;
        }
        int leftSum=0;
        for(int i = 0; i < n; i++){
            int rightSum = total - leftSum - nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return ans;
    }
}
