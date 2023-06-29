import java.util.*;

class HelloWorld {
    
    public static void reversearray(int[] arr,int start,int end){
        int temp=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1};
        reversearray(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
       
    }
}
