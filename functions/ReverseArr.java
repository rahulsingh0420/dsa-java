import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // for (int i = 0; i < (arr.length / 2); i++) {
        //     if ((arr.length - 1 - i) == i) {
        //         continue;
        //     }
        //     swap(arr.length - (i + 1), i, arr);
        // }
        reverse_arr(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void reverse_arr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(start, end, arr);
            start++;
            end--;
        }
    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
