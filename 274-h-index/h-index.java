
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] bucket = new int[n + 1]; // Bucket for counting

        // Step 1: Populate the bucket
        for (int citation : citations) {
            if (citation >= n) {
                bucket[n]++; // Count citations >= n in the last bucket
            } else {
                bucket[citation]++; // Count citations directly
            }
        }

        // Step 2: Accumulate counts from the end
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += bucket[i];
            if (total >= i) { // h-index condition
                return i;
            }
        }
        return 0;
    }
}
