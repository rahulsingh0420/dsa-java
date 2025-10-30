import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Emter Lenght: ");
        double l = in.nextDouble();
        System.out.print("Emter Width: ");
        double w = in.nextDouble();

        double a = l * w;
        System.out.println("Area: "+a);

    }
}