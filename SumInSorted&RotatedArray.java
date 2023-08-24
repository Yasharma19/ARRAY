import java.util.*;
class HelloWorld {
    public static boolean pairInSortedRotated(int[] arr,int N,int X){
        Arrays.sort(arr);
        int i=0;
        int j=N-1;
        while(i<j){
            if(arr[i]+arr[j]==X){
                return true;
            }
            else if(arr[i]+arr[j]<X){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int X = 144;
        int N = arr.length;
 
        if (pairInSortedRotated(arr, N, X))
            System.out.print("true");
        else
            System.out.print("false");
    }
}



...................................................................................................................................................................


//Another SOLUTION //

class HelloWorld {
    
    public static boolean SumSorted(int[] arr,int n,int x){
        int i;
        for(i=0;i<n-1;i++)
            if(arr[i]>arr[i+1])
                break;
        int l=(i+1)%n;
        int r=i;
        
        while(l!=r){
            if(arr[l]+arr[r]==x){
                return true;
            }
            
            if(arr[l]+arr[r]<x)
                l=(l+1)%n;
            else
                r=(n+r-1)%n;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr={5,6,7,1,2,3};
        
        System.out.println(SumSorted(arr,6,6));
    }
}
