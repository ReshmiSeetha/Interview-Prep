package DSA;

import java.util.Map;
import java.util.HashMap;
public class SubArraySumEqualsK {
    public static void main(String args[]){
        int[] arr ={1,1,1};
        int k = 2;
        int res = subarraySum(arr,k);
        System.out.print(res);
    }
    public static int subarraySum(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);//initialize the map with sum 0 and count 1
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
