public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
        int[] arr = { 20, 17, 15, 12, 10, 8, 5, 3, 1 };
        if (arr[0] > arr[arr.length - 1]) {
            System.out.println(descBinarySearch(arr, 8));
        } else {
            System.out.println(ascBinarySearch(arr, 4));
        }

    }
    
    static int descBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midEl = arr[mid];
            if (midEl == target) {
                return mid;
            }
            if (midEl > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    static int ascBinarySearch(int[] arr, int target){
        
        int start = 0;
        int end = arr.length;
        
        while (start <= end) {
            int mid = start + (end -start)/2;
            int midEl = arr[mid];
            if (midEl == target) {
                return mid;
            }
            if (midEl > target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }


}
