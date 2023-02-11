import java.util.Scanner;
//import java.lang.System;
class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priciple,rate,time,si;

        System.out.println("Enter the principle amount,rate,time: ");

        priciple=sc.nextDouble();
        rate=sc.nextDouble();
        time=sc.nextDouble();


        si=(priciple*rate*time)/100;
        System.out.println("Simple Interest is: "+si);
        sc.close();
    }
}