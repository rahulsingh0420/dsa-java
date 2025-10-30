import java.util.Scanner;

public class Laragest {
    // find largest from three numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // int largest;
        // if (a > b && a > c) {
        //     largest = a;
        // } else if (b > a && b > c) {
        //     largest = b;
        // } else {
        //     largest = c;
        // }

        // int largest = a;
        // if (b > largest) {
        //     largest = b;
        // }
        // if (c > largest) {
        //     largest = c;
        // }
        
        int max = Math.max(Math.max(a, b), c);
        
        System.out.println("Max: " + max);
        // System.out.println("Largest: " + largest);

    }
}
