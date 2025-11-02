import java.util.ArrayList;
import java.util.Scanner;

public class MulDAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        // Initializing 
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // adding values
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        // print
        System.out.println(list);

    }
}
