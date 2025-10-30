import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = in.nextInt();
        int count = 0;
        while (num > 0) {
            if (num % 10 == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);

    }
}
