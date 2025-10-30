import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = in.nextDouble();
        System.out.print("Enter Height: ");
        double height = in.nextDouble();

        double area = (height * base) / 2;
        System.out.println("Area: "+area);

    }
}
