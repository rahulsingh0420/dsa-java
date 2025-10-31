import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Emter side: ");
        double side = in.nextDouble();
        double a = 6 * Math.pow(side, 2);
        System.out.println("Area: "+a);
    }
}
