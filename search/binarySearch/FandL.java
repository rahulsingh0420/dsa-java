import java.util.Arrays;

class FandL {

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }
    
    static int search(int[] nums, int target, boolean searchFirstIndex) {
        int index = -1;
        int s = 0;
        int e = nums.length-1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] > target) {
                e = m - 1;
            }else if(nums[m] < target){
                s = m + 1;
            } else {
                index = m;
                if (searchFirstIndex) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }    
        }
        return index;
    }


}