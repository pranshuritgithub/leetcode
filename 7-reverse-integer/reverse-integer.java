class Solution {
    public int reverse(int x) {
        int num = x;
        int ans = 0;

        while(num != 0)
        {
            int lastDigit = num % 10;
            
            if((ans < Integer.MIN_VALUE / 10) || (ans > Integer.MAX_VALUE / 10)) {
                return 0;
            } 
            ans = (ans*10)+ lastDigit;
            num = num / 10;
        }
        return ans;
    }
}