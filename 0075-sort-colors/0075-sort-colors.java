class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int zero = 0, one = 0, two = 0;

        // 1st pass: Count 0s, 1s, and 2s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zero++;
            else if (arr[i] == 1) one++;
            else two++;
        }

        // 2nd pass: Overwrite array with sorted values
        for (int i = 0; i < zero; i++) arr[i] = 0;
        for (int i = zero; i < zero + one; i++) arr[i] = 1;
        for (int i = zero + one; i < n; i++) arr[i] = 2;
    }
}
