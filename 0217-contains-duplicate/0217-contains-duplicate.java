import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);  // sort the array
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("Duplicate at: " + nums[i]);
                return true;  // duplicate found
            }
        }
        return false; // no duplicates
    }

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int[] arr = {1, 2, 75, 48, 4, 2};
    //     System.out.println("Contains Duplicate: " + sol.containsDuplicate(arr));
    // }
}

