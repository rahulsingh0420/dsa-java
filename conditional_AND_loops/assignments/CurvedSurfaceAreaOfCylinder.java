import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Emter radius: ");
        double r = in.nextDouble();
        System.out.print("Emter height: ");
        double h = in.nextDouble();
        double a = 2 * 3.14159 * r * h;
        System.out.println("Area: "+a);
    }
}
