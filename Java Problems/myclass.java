import java.util.Scanner;

public class myclass {
    int a;

    public myclass() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        a = s.nextInt();
    }

    public static void main(String[] args) {
        myclass my = new myclass();
        System.out.println("Your number is: " + my.a);
       // s.close();

    }

}
