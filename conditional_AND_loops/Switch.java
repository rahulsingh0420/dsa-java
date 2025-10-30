import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int day = in.nextInt();
        // String fruit = in.next();

        // switch (fruit) {
        //     case "mango" -> System.out.println("King of fruits");
        //     case "Apple" -> System.out.println("Sweet red fruit");
        //     case "Orange" -> System.out.println("Round Fruit");
        //     case "Grapes" -> System.out.println("Small fruit");
        // }

        // switch (day) {
        //     case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
        //     case 6, 7 -> System.out.println("Weekend");
        //     default -> System.out.println("Undefined");
        // }
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Number 1");
            case 2 -> System.out.println("Number 2");
            case 3 -> System.out.println("Number 3");
            case 4 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department, Number 4");
                    case "Management" -> System.out.println("Management Department, Number 4");
                    case "HR" -> System.out.println("HR Department, Number 4");
                    default -> System.out.println("Undefined Department");
                }
            }
            default -> System.out.println("Undefined EMP ID");
        }
    
    }
}
