import java.util.Scanner;
import java.util.Arrays;

public class Arrays_me {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
