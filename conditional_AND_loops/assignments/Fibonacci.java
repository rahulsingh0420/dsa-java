import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int prev = 0;
        int current = 1;
        int count = 2;
        if (n >= 1) {
            System.out.print(0 + " ");
        }
        if (n >= 2) {
            System.out.print(1 + " ");
        }
        while (count < n) {
            int temp = prev + current;
            current = temp;
            prev = current;
            System.out.print(temp+" ");
            count++;
        }

    }
}
