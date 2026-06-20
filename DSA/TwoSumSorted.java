package DSA;

public class TwoSumSorted{
	public static void main(String args[]){
		int[] a = {2,4,5,8,9};
		int target = 10;
		int[] result = twoSum(a,target);
		System.out.println(result[0]+" "+result[1]);
	}

	public static int[] twoSum(int[] arr, int target){
		
    int left = 0, right = arr.length-1;
    while(left<right){
        int sum = arr[left]+arr[right];
        if(sum == target)
            return new int[]{left, right};
        else if (sum < target)
            left++;
        else
            right--;
    }
    return new int[]{0,0};
}
}
