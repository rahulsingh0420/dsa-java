import java.util.Arrays;
// solving on leetcode
class Solution {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};

        int[][] newArr = transpose(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(Arrays.toString(newArr[i]));;
        }
    }

    static int[][] transpose(int[][] matrix) {
        for(int row = 0; row<matrix.length-1; row++){
            swap(row, matrix);
        }   
        return matrix;
    }

    static void swap(int i, int[][] matrix){
        for(int j = i; j < matrix[i].length; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

// 
}