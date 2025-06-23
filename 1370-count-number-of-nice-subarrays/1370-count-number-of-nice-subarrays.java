import java.util.*;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);  // Base case: 0 odd numbers seen initially

        int oddCount = 0;
        int result = 0;

        for (int num : nums) {
            // Update odd count
            if (num % 2 != 0) {
                oddCount++;
            }

            // Check if there is a prefix with (oddCount - k) odds
            result += prefixMap.getOrDefault(oddCount - k, 0);

            // Store this oddCount into the map
            prefixMap.put(oddCount, prefixMap.getOrDefault(oddCount, 0) + 1);
        }

        return result;
    }
}
