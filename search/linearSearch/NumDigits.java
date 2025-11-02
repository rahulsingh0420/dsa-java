// // https://leetcode.com/problems/find-numbers-with-even-number-of-digits
// public class NumDigits {
//     public static void main(String[] args) {
//         int[] nums = { 12, 345, 2, 6, 7896 };
//         System.out.println(numOfEvenDigits(nums));
//     }

//     static int numOfEvenDigits(int[] arr) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (numOfDigits(arr[i]) % 2 == 0) {
//                 count++;
//             }
//         }
//         return count;
//     }
    
//     static int numOfDigits(int n){
//         int count = 0;
//         while (n > 0) {
//             n = n / 10;
//             count++;
//         }
//         return count;
//     }


// }

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class NumDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int count = 0;
        for (int num : nums) {
            if (Math.floor((Math.log10(num) + 1)) % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
