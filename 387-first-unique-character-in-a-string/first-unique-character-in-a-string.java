class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int freq[] = new int[256];

        for(int i=0;i<n;i++)
        {
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<n;i++)
        {
            if(freq[s.charAt(i)] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}