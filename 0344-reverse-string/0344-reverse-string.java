class Solution {
    public void reverseString(char[] s) {
        int n = s.length;

        for(int i=0;i<n;i++)
        {
            for(int j=s.length-1;j<n;j++)
            {
                while(i <= j)
                {
                    char temp = s[i];
                    s[i]= s[j];
                    s[j] = temp;
                    i++;
                    j--;
                }
            }
        }
    }
}