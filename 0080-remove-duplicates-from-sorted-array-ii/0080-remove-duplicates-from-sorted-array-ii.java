class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int index = 2; // Start from 2 since the first two elements can always stay
        for (int i = 2; i < nums.length; i++) {
            // Only copy nums[i] if it's not the same as the element two places before
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

