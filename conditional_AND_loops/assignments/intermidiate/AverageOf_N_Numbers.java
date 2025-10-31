package intermidiate;
import java.util.Scanner;

public class AverageOf_N_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter Number (Enter 0 if want to show avg): ");
            double num = in.nextDouble();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }
        double avg = sum / count;
        System.out.println("Average: "+avg);
    }
}