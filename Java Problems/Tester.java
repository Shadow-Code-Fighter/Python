import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		double discount;
        int customerType;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of your choice: ");
        customerType=sc.nextInt();
		switch (customerType) {
		case 1:
			discount = 5;

		case 2:
			discount = 10;

		default:
			discount = 0;
		}
		System.out.println("Customer has got discount of " + discount + "%");
		sc.close();
	}
	
}