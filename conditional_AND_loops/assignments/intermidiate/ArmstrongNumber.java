package intermidiate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int power = (int) Math.log10(Math.abs(n)) + 1;
        int count = 0;
        int temp = n;
        while (n > 0) {
            count += Math.pow((n % 10), power);
            n = n / 10;
        }
        if (count == temp ) {
            System.out.println("is a Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
