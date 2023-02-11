import java.util.Scanner;

class Table {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
        }
        // in.close();

    }

}
