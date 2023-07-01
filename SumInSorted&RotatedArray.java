// Online Java Compiler
// Use this editor to write, compile and run your Java code online

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
