import java.util.*;

class HelloWorld {
    
    public static int MergeOperation(int[] arr){
        int n=arr.length;
        int ans=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]<arr[j]){
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }
            else{
                j--;
                arr[j]+=arr[j+1];
                ans++;
            }
        }
        return ans; 
    }
    
    public static void main(String[] args) {
        int[] arr={1, 4, 5, 9, 1};
        System.out.println(MergeOperation(arr));
        
    }
}
