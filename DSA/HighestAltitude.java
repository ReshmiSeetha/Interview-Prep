package DSA;

public class HighestAltitude {
    public static void main(String args[]){
        int[] arr={-5,1,5,0,-7};
        int res=highestAltitude(arr);
        System.out.print(res);
    }
    public static int highestAltitude(int[] gain){
        int current=0;
        int max = 0;
        for(int g : gain){
            current+=g;
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}
