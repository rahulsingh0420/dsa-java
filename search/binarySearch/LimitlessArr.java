public class LimitlessArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
        int target = 8;
        int s = 0;
        int e = 1;
        while (target > arr[e]) {
            int rangeSize = (e - s + 1);
            s = e+1;
            e = s + (rangeSize * 2) - 1;
        }
        System.out.println(search(arr, target, s, e));
    }
    
    static int search(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target < arr[m]) {
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
                e = e * 2;
            } else {
                return m;
            }
        }
        return -1;
    }


}
