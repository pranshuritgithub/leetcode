class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int currmax = nums[0];
        int maxSum = nums[0];
        int currmin = nums[0];
        int minSum = nums[0];
        int total = nums[0];

        for(int i=1;i<n;i++)
        {
            currmax = Math.max(nums[i],nums[i] + currmax);
            maxSum = Math.max(maxSum,currmax);
            currmin = Math.min(nums[i],nums[i] + currmin);
            minSum = Math.min(minSum,currmin);
            total += nums[i];
        }
        if(maxSum < 0)
        {
            return maxSum;
        }
        return Math.max(maxSum,total - minSum);
    }
}