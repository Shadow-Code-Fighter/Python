import java.util.Scanner;

class Pelindrome {
    public static void main(String args[]) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a pelindrome name/num: ");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("name/num is Pelindrome "+original);
        else
            System.out.println("Not! a Pelindrome");
        in.close();
    }

}
