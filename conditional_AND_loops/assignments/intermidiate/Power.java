package intermidiate;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = in.nextDouble();
        System.out.print("Enter Power of Number: ");
        double x = in.nextDouble();
        DecimalFormat df = new DecimalFormat("#.###");
        double value = Math.pow(n, x);
        System.out.println("Value: "+df.format(value));

    }
}
