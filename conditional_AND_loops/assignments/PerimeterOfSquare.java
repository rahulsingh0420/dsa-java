import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double side = in.nextDouble();

        double a = 4 * side;
        System.out.println("Perimeter: "+ a);
    }
}
