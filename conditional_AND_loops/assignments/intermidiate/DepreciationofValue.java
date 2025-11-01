//  (Cost of Asset – Salvage Value) / Useful Life
package intermidiate;

import java.util.Scanner;

public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Cost Of Asset: ");
        double cost = in.nextDouble();
        System.out.print("Salvage value: ");
        double salvage = in.nextDouble();
        System.out.print("Useful Life: ");
        double life = in.nextDouble();

        double dep = (cost - salvage) / life;
        System.out.println("Depreciation of Value: "+dep);


    }

}
