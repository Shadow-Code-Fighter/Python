import java.util.*;
class evenodd {
    public static void main(String []args){
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = s.nextInt();
        if(num%2==0)
        System.out.println(num + "  is an even number" );
        else
        System.out.println(num + " is an odd number" );
        s.close();
    }
    
}
