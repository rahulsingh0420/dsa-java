import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        System.out.print(1+" ");
        for (int i = 2; i*i < n; i++) {
            if (n%i == 0) {
                System.out.print(i + " ");
                System.out.print(n/i + " ");
            }
        }
        
        System.out.print(n);

    }
}
