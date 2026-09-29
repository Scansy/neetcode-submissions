class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left, right;
        left = 0;
        right = numbers.length - 1;
        int[] solution = new int[2];

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                solution[0] = left + 1;
                solution[1] = right + 1;
                return solution;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[0];
    }
}
