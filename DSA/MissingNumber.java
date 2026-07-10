package DSA;

public class MissingNumber {
    public static void main(String args[]){
        int[] arr={3,0,1};
        int res=missingNumber(arr);
        System.out.print(res);
    }
    public static int missingNumber(int[] nums){
        int xor = nums.length;
        for(int i = 0; i < nums.length; i++){
            xor ^= i ^ nums[i];
        }
        return xor;
    }
}
