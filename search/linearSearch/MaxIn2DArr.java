public class MaxIn2DArr {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int max = arr[0][0];
        for (int[] element : arr) {
            for (int element2 : element) {
                if (element2 > max) {
                    max = element2;
                }
            }
        }
        return max;
    }

}
