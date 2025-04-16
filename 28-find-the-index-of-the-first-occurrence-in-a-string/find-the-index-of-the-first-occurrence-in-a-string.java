class Solution {
    public int strStr(String haystack, String needle) {
        
        int N = haystack.length();
        int M = needle.length();
        int i = 0;
        int j = 0;

        while(i < N)
        {
            if(j < M && haystack.charAt(i) == needle.charAt(j))
            {
                i++;
                j++;

                if(j == M)
                {
                   return (i - j);
                }
            }
                else{
                    i = i - j + 1;
                    j = 0;
                }
        }
        return -1;
    }
}