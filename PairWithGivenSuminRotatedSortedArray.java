import java.util.*;

class HelloWorld {
    
    public static boolean Sum(int[] arr,int k){
        int n=arr.length;
        int i;          //Finding pivot element(Highest element);
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        int l=(i+1)%n;      //Index of Smallest element
        int r=i;           //Index of Largest element
        
        while(l!=r){
            if(arr[l]+arr[r]==k){
                return true;
            }
            else if(arr[l]+arr[r]<k){
                l=(l+1)%n;
            }
            else{
                r=(n+r-1)%n;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        System.out.println(Sum(arr,26));
    }
}
