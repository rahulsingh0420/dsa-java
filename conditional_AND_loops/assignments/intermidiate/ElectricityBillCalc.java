package intermidiate;

import java.util.Scanner;

public class ElectricityBillCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Prev Reading: ");
        int prevReading = in.nextInt();
        System.out.print("Current Reading: ");
        int currReading = in.nextInt();
        System.out.print("Rate Per Unit: ");
        double rpu = in.nextDouble();

        double a = (currReading - prevReading) * rpu;

        System.out.println("Bill: "+a);

    }
}
