import java.util.*;

class HelloWorld {
    public static int CDP(int[] arr,int n,int m){
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        
        for(int i=0;i+m-1<n;i++){
            minDiff=Math.min(arr[i+m-1]-arr[i],minDiff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int arr[]={3,4,1,9,56,7,9,12};
        int a=CDP(arr,8,5);
        System.out.println(a);
        
        
    }
}
