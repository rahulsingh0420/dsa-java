import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = in.nextDouble();

        double p = 2 * 3.14159 * r;

        System.out.println("Perimeter Of Circle: "+p);

    }
}
