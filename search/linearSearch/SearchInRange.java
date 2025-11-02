public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(search(3, arr, 1, 5));
    }
    
    static int search(int target, int[] arr, int start, int end) {
        if (end > arr.length) {
            end = arr.length;
        }
        if (start < 0) {
            start = 0;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    } 

}
