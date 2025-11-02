import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_me {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // System.out.println(list.contains(3));
        // System.out.println(list.get(2));    
        // list.remove(0);
        // list.set(0, 12);
        // System.out.println(list);    
        for (int i = 0; i < 5; i++) {
            int x = in.nextInt();
            list.add(x);
        }
        for (int i = 0; i < list.size(); i++) {
            String suffix = i+1 == list.size() ? "." : ",";
            System.out.print(list.get(i)+suffix);
        }
        // System.out.println(list);

    }
}