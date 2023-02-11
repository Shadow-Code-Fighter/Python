
import java.util.*;

class Converter {
    public static double BinaryDecimal(double n) {
        double num = 0, rem;
        int i = 0;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            num = num + rem * Math.pow(2, i);
            i++;
        }
        return num;
    }

    public static long DecimalBinary(int n) {
        long num = 0, i = 1, rem;
        while (n != 0) {
            rem = n % 2;
            n = n / 2;
            num = num + rem * i;
            i *= 10;
        }
        return num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice:\n 1.Convert binary to decimal\n 2.Convert decimal to binary\n");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter the binary number:");
                Double b = sc.nextDouble();
                double dec = BinaryDecimal(b);
                System.out.println("The decimal number is:" + (int) dec);
                System.exit(0);
            case 2:
                System.out.println("Enter the decimal number:");
                int c = sc.nextInt();
                long bin = DecimalBinary(c);
                System.out.println("The binary number is:" + (int) bin);
                System.exit(0);
            default:
                System.exit(0);
        }
    }
}