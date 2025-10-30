import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Emter radius: ");
        double r = in.nextDouble();
        System.out.print("Emter height: ");
        double h = in.nextDouble();
        double v = ((3.14159 * Math.pow(r, 2)) * h) / 3;
        System.out.println("Volume: "+v);
    }
}
