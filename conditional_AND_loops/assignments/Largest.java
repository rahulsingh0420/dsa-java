import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = 0;
        while (true) {
            System.out.print("Enter Number: ");
            int num = in.nextInt();
            if (num == 0) {
                break;
            } else {
                if (largest < num) {
                    largest = num;
                }
            }
        }
        System.out.print("Largest: "+largest);         
    }    
}
