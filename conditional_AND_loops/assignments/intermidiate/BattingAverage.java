package intermidiate;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int total = 0;
        while (true) {
            System.out.print("Enter Runs (enter runs 999 to stop and show avg): ");
            int runs = in.nextInt();
            if (runs == 999) {
                break;
            }
            total += runs;
            count++;
        }
        int avg = total / count;
        System.out.print("Average Batting Runs: " + avg);
    }
}
