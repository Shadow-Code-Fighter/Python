import java.util.*;
public class Tempreture {
    public static void main(String []args){
        float fahrenheit,cecelsius;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the tempreture in fahrenheit:");
        fahrenheit=sc.nextFloat();
        cecelsius=(fahrenheit-32)*5/9; 
        System.out.println("Tempreture in cecelsius is: "+cecelsius);
        sc.close();
    }
}
