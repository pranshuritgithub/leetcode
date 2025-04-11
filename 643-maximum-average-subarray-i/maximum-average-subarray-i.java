class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        int left = 0, right = 0;

        while(right < n)
        {
            currSum += nums[right];

            if(right - left + 1 == k)
            {
                max = Math.max(max,currSum);
                currSum -= nums[left];
                left++;
            }
            right++;
        }
        return (double) max / k;
    }
}