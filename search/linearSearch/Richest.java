// https://leetcode.com/problems/richest-customer-wealth/description/
public class Richest {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int tempSum = sum(accounts[i]);
            if (tempSum > max) {
                max = tempSum;
            }
        }
        System.out.println(max);
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
