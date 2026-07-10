package DSA;

public class FirstAndLastPositionInSortedArray {
    public static void main(String args[]){
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] res=searchRange(arr,target);
        for(int i=0;i<res.length;i++){  
            System.out.print(res[i]+" ");
        }
    }
    public static int[] searchRange(int[] nums, int target){
        int first=findOccurance(nums, target, true);
        int last=findOccurance(nums, target, false);
        return new int[]{first, last};
    }
    public static int findOccurance(int[] nums, int target, boolean first){
        int left =0;
        int right = nums.length -1;

        int result = -1;
        while(left <=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                result = mid;
                if(first){
                    right =mid -1;
                }else{
                    left = mid +1;
                }
            }else if(nums[mid] < target){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        return result;
    }
}
