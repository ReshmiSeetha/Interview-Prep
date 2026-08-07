package DSA;

//Leetcode 344. Reverse String
//Write a function that reverses a string. The input string is given as an array of characters s.
//You must do this by modifying the input array in-place with O(1) extra memory
public class ReverseAString {
    public static void main(String args[]){
        char[] arr={'h','e','l','l','o'};
        reverseString(arr);
        for(int i=0;i<arr.length;i++){  
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseString(char[] s) {
        char temp;
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    
}
