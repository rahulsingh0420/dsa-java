class Solution {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j', 'k'};
        char target = 'c';
        System.out.println(search(letters, target));
        
    }

    static char search(char[] arr, char target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (e + (e - s)) / 2;

            if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return arr[s % arr.length];
    }

}