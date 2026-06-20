package DSA;

import java.util.HashMap;
import java.util.Map;

public class TwoSumCode{
    public static void main(String args[]){
        int a[] = {2,8,6,3,12};
        int target = 8;
        int result[] = twoSum(a,target);
        System.out.print(result[0]+" "+result[1]);
    }

    public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int c = target - arr[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c),i};
    }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}
