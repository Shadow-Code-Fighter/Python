import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {

        int n, b, sum = 0, rem;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number=");
        n = sc.nextInt();
        b = n;
        
        while (n > 0) {
        rem = n % 10;
        sum = sum * 10 + rem;
        n = n / 10;
        }
        if (b == sum)
        System.out.println("Number is Pallindrome");
        else
        System.out.println("Number is not Pallindrome");
        sc.close();
        }
       
        
        }
        
    
