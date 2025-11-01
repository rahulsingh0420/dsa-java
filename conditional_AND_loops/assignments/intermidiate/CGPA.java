package intermidiate;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double total = 0;
        System.out.print("\nEnter Max Marks A subject can have: ");
        int max = in.nextInt();
        System.out.print("\nEnter -1 to stop: \n\n");
        while (true) {
            int subjectCount = count + 1;
            System.out.print("Enter Subject_" + subjectCount + " Marks: ");
            double mark = in.nextDouble();
            if (mark == -1) {
                break;
            }
            if (mark > max) {
                System.out.print("Skipped...\n");
                continue;
            }
            count++;
            total += mark;
        }
        double percentage = (total / (count * max)) *100;
        double cgpa = percentage / 9.5;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("CGPA: "+df.format(cgpa)); 
    }
}
