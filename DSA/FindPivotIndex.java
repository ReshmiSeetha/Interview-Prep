package DSA;

public class FindPivotIndex {
    public static void main(String args[]){
        int[] arr={1,7,3,6,5,6};
        int res=findPivotIndex(arr);
        System.out.print(res);
    }
    public static int findPivotIndex(int[] nums){
        int n=nums.length;
        int total=0;
        int leftSum=0;
        for(int num:nums){
            total+=num;
        }
        for(int i=0;i<n;i++){
            int rightSum=total-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}
