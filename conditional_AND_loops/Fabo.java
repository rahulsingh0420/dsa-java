// import java.util.Scanner;

// public class Fabo {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();

//         int prev = 0;
//         int current = 1;

//         System.out.print(prev + " ");
//         System.out.print(current + " ");

//         while (n > current) {
//             int fabnum = prev + current;
//             if (fabnum > n) {
//                 break;
//             }
//             prev = current;
//             current = fabnum;
//             System.out.print(fabnum + " ");
//         }

//     }
// }

import java.util.Scanner;

public class Fabo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int prev = 0;
        int current = 1;
        int count = 2;
        if (n == 1) {
            System.out.print(prev + " ");
        } else {
            System.out.print(prev + " ");
            System.out.print(current + " ");
        }

        while (n > count) {
            int fabnum = prev + current;
            prev = current;
            current = fabnum;
            System.out.print(fabnum + " ");
            count++;
        }

    }
}
