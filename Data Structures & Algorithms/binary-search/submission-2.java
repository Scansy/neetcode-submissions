class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }

    private int helper(int[] nums, int target, int start, int end) {
        if (end - start == 0) {
            if (nums[start] == target) {
                return start;
            } else {
                return -1;
            }
        }

        int middle = (start+end)/2;
        if (nums[middle] == target) { 
            return middle;
        } else if (nums[middle] < target) {
            return helper(nums, target, middle + 1, end);
        } else {
            return helper(nums, target, start, middle);
        }
    }
}
