class Solution {
    public int[] runningSum(int[] nums) {
        // Start the loop from index 1 since the first element remains the same
        for (int i = 1; i < nums.length; i++) {
            // Add the previous element's value to the current element
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}