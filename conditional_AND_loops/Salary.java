import java.util.Scanner;

class Salary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if(salary > 10_000){
            salary += 2000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);

    }
}