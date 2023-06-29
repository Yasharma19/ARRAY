import java.util.*;

class HelloWorld {

    public static void main(String[] args) {
        String str="YASH SHARMA";
        String rev="";
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        
        System.out.println("Reverse String is "+rev);
       
    }
}
