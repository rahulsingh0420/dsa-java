import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double side = in.nextDouble();

        double a = (Math.sqrt(3) * Math.pow(side, 2)) / 4;
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println("Area: "+df.format(a));

    }
}
