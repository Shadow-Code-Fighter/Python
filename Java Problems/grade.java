import java.util.Scanner;

public class grade {
    public static void main(String[]args){
        int marks;
        Scanner m=new Scanner(System.in);
        System.out.println("Enter a marks");
        marks=m.nextInt();
        
        if(marks<40){
            System.out.println("Fail");}
            else if(marks>=40 && marks<50){
                System.out.println("D grade");
            }
            else
            {
                System.out.println("Pass");
        }
        m.close();
    }
}
