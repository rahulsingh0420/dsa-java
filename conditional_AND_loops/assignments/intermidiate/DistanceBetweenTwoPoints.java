package intermidiate;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First points, cordinates: ");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        System.out.print("Enter Second points, cordinates: ");
        int y1 = in.nextInt();
        int y2 = in.nextInt();

        DecimalFormat df = new DecimalFormat("#.###");
        double d = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("Distance: "+df.format(d));

    }
}
