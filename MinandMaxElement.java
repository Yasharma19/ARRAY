import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int arr[]={2,3,445,5,55};
        int minn=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            minn=Math.min(arr[i],minn);
            maxx=Math.max(arr[i],maxx);
        }
        
        System.out.println("Min and Max are "+minn+" and "+maxx);
    }
}
