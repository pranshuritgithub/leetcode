class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Step 1: Find the sum of numbers from 0 to n
        int totalSum = n * (n + 1) / 2;
        
        // Step 2: Find the sum of elements in the array
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        // Step 3: Missing number = totalSum - arraySum
        return totalSum - arraySum;
    }
}
