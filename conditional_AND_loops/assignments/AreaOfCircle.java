package assignments;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double r = in.nextDouble();

        double area = 3.14159 * r*r;
        System.out.println(area);

    }
}
