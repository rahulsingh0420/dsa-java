package intermidiate;

import java.util.Scanner;

public class DiscountOfProduct {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Product Price: ");
        double originalPrice = in.nextDouble(); 
        System.out.print("Enter Product Discount %: ");
        double discountPercentage = in.nextDouble();

        double discountedPrice = originalPrice - (originalPrice * discountPercentage) / 100;
        System.out.println("Discounted Price: "+discountedPrice);

    }    
}