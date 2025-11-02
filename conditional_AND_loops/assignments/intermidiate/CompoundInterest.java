package intermidiate;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Rate (%): ");
        double r = in.nextDouble();
        r = (r / 100);

        System.out.print("P Ammount: ");
        double p = in.nextDouble();

        System.out.print("N: ");
        int n = in.nextInt();

        System.out.print("time : ");
        int t = in.nextInt();

        double a = p * (Math.pow(((n + r) / n), n * t));

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Final Amount: "+df.format(a));

    }
}
