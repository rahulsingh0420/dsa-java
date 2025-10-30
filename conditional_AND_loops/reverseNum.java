import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
