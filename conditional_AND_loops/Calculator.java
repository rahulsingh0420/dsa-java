import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int result = 0;
            System.out.print("Enter opration: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    result = num1 + num2;
                }
                if (op == '-') {
                    result = num1 - num2;
                }
                if (op == '*') {
                    result = num1 * num2;
                }
                if (op == '/') {
                    result = num1 / num2;
                }
                if (op == '%') {
                    result = num1 % num2;
                }
                System.out.println("Ans: "+result);
            }else if(op == 'x' || op == 'X'){
                break;
            } else {
                System.out.print("Invalid opration enter 'x' or 'X' to end program");
                System.out.println();
            }
        }
    }
}
