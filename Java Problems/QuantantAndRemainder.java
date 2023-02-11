import java.util.Scanner;

class QuantantAndRemainder {
    public static void main(String[] args) {
        double num1, num2, quantant, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();
        quantant = num1 / num2;
        remainder = num1 % num2;
        System.out.println("num1:" + num1 + "num2:" + num2);
        System.out.println("Quantant is: " + quantant);
        System.out.println("Remainder is: " + remainder);
        sc.close();

    }
}