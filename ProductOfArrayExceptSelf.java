import java.util.*;

class HelloWorld {
    public static int[] product(int[] arr){
        int n=arr.length;
        
        int[] prod=new int[n];
        if(n==1){
            return prod;
        }
        Arrays.fill(prod,1);
        int temp=1;
        for(int i=0;i<n;i++){
            prod[i]=temp;
            temp*=arr[i];
        }
        temp=1;
        for(int i=n-1;i>=0;i--){
            prod[i]*=temp;
            temp*=arr[i];
        }
        return prod;
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] prod=product(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(prod[i]);    
        }
        
    }
}
