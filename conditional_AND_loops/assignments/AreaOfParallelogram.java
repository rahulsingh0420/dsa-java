import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double b = in.nextDouble();
        System.out.print("Enter Height: ");
        double h = in.nextDouble();

        double a = b * h;
        System.out.println("Area: "+a);

    }
}
