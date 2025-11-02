import java.util.Scanner;

public class First {
    static String admin = "Rahul";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.next();
        greet(name);
    }

    static void greet(String name) {
        System.out.println("Hello! "+name+" saying "+admin);
    }

}