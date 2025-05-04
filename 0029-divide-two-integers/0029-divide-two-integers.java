class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to long to handle overflow and take absolute values
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        int result = 0;

        while (ldividend >= ldivisor) {
            long temp = ldivisor, multiple = 1;

            // Double the divisor until it is less than or equal to dividend
            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            ldividend -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }
}
