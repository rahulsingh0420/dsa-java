import java.util.Arrays;
// solving on leetcode
class Solution {

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));;
    }

    static int[] shuffle(int[] arr, int n) {
        int[] newArr = new int[n * 2];
        int j = 0;

        for (int i = 0; i < n; i++) {
            newArr[j++] = arr[i]; 
            newArr[j++] = arr[i + n];
        }

        return newArr;
    }




// 
}