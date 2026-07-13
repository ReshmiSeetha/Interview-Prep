package DSA;

import java.util.HashMap;
import java.util.Map;
public class FruitIntoBasket {
    public static void main(String args[]){
        int[] arr={1,2,1};
        int res=totalFruits(arr);
        System.out.print(res);
    }

    public static int totalFruits(int[] fruits) {
        int left = 0;
        int best = 0;

        Map<Integer, Integer> count = new HashMap<>();
        for(int right = 0; right < fruits.length; right++){
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);
            
            while(count.size() > 2){
                int leftFruit = fruits[left];
                count.put(leftFruit, count.get(leftFruit) -1);
                
                if(count.get(leftFruit) == 0){
                    count.remove(leftFruit);
                }

                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;        
    }
}
