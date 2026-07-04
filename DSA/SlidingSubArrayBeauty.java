package DSA;

public class SlidingSubArrayBeauty {
    public static void main(String args[]){
        int[] arr ={1,3,-1,-3,5,3,6,7};
        int k = 3;
        int x = 2;
        int[] res = getSubarrayBeauty(arr,k,x);
        for(int i=0;i<res.length;i++){  
            System.out.print(res[i]+" ");
        }
    }
    public static int[] getSubarrayBeauty(int[] nums, int k, int x){
        int n=nums.length;
        int[] freq= new int[101];
        int[] ans=new int[n-k+1];
        int index=0;
        for(int i=0;i<n;i++){
            freq[nums[i]+50]++;
            if(i>=k){
                freq[nums[i-k]+50]--;
            }
            if(i>=k-1){
                ans[index++]=getBeauty(freq,x);
            }
        }
        return ans;
    }

    public static int getBeauty(int[] freq,int x){
        int count = 0;
        for(int num=-50;num<0;num++){
            count+=freq[num+50];
            if(count>=x){
                return num;
            }
        }
        return 0;
    }
}
