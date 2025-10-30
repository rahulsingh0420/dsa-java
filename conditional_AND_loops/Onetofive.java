import java.util.Scanner;

class Onetofive {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(i);
        // }

        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     System.out.println(i);
        // }

        // int i = 1;
        // while (i <= 5) {
        //     System.out.println(i);
        //     i++;
        // }

        // int j = 1;
        // int n = input.nextInt();
        // while (j <= n) {
        //     System.out.println(j);
        //     j++;
        // }

        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while (i <= 5);

        int j = 1;
        int n = input.nextInt();
        do{
            System.out.println(j);
            j++;
        }while(j <= n);

    }
}