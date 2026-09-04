class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {;
            int diff = target - nums[i];
            if (map.get(diff) == null) {
                map.put(nums[i], i); 
            } else {
                int[] solution = {map.get(diff), i};
                return solution;
            }
        }
        return new int[0];
    }
}
