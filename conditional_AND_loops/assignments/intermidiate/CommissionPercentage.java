package intermidiate;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Sales Amount: ");
        double salesAmount = in.nextDouble();
        System.out.print("Enter Commision u get: ");
        double commision = in.nextDouble();

        double commissionPercentage = commision * 100 / salesAmount;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Percentage: "+df.format(commissionPercentage)+"%");

    }
}
