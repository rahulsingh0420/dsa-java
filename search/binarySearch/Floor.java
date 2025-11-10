public class Floor {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 8, 9, 11, 12, 13, 15 };
        System.out.println(floor(arr, 18));
    }

    static int floor(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return target;
        }
        if (target < arr[0]) {
            return target;
        }
        while (s <= e) {
            int m = (e + (e - s)) / 2;
            if (arr[m] == target ||  ((arr[m] > target) && (arr[m-1] < target))) {
                return arr[m - 1];
            }   
            if (target < arr[m]) {
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return arr[s-1];
    }
}
