public class MaxItem {
    public static void main(String[] args) {
        int[] arr = { 121211, 2, 3, 4, 5, 522267, 7, 98, 90, 34, 45, 4545, 65, 6, 5 };
        System.out.println(getMax(arr));
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
