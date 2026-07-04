package DSA;

public class RunningSum {
    public static void main(String args[]){
        int[] arr ={1,2,3,4};
        int[] res = runningSum(arr);
        for(int i=0;i<res.length;i++){  
            System.out.print(res[i]+" ");
        }
    }
    public static int[] runningSum(int[] nums){
        int n =nums.length;
        int sum=0;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
