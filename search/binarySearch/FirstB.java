public class FirstB{
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        int s = 0;
        int e = arr.length - 1;
        int target = 13;
        int count = 1;
        while (s <= e) {
            System.out.println("Iteration Number: "+count);
            int m = ((s + e) / 2);
            if (arr[m] == target) {
                System.out.println("ans: " + m);
                break;
            }
            if (arr[m] > target) {
                e = m -1;
            } else {
                s = m + 1;
            }
            count++;
        }
    }
}