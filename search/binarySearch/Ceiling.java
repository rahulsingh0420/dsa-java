public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 9, 11, 12, 13, 15 };
        System.out.println(ceil(arr, 2));
    }

    static int ceil(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return target;
        }
        if (target<arr[0]) {
            return arr[0];
        }
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == target || ((arr[m] > target) && (arr[m - 1] < target))) {
                return arr[m];
            }
            if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return arr[e];
    }

}
