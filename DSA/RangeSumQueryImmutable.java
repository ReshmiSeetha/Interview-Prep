package DSA;

public class RangeSumQueryImmutable {
    public static void main(String args[]){
        int[] arr ={1,2,3,4,5};
        NumArray obj = new NumArray(arr);
        int res = obj.sumRange(0,2);
        System.out.print(res);
    }
}
class NumArray {
    int[] prefix;
    public NumArray(int[] nums) {
       prefix=new int[nums.length+1];
       for(int i=0;i<nums.length;i++){
        prefix[i+1]=prefix[i]+nums[i];
       }
    }

    public int sumRange(int left, int right) {
       return prefix[right+1]-prefix[left];
    }
}
