import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = sc.nextLine();
        if (input.matches("^[01]+$")) {
            int decimal = Integer.parseInt(input, 2);

            System.out.println("Decimal: " + decimal);
        } else if (input.matches("^[0-9]+$")) {
            int decimal = Integer.parseInt(input);
            String binary = Integer.toBinaryString(decimal);

            System.out.println("Binary: " + binary);
        } else {
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}
