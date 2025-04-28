class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int num = 1;
        int i = 0;
        
        while(i < n && k > 0)
        {
            if(arr[i] == num)
            {
                i++;
            }
            else{
                k--;
            }
            
            num++;
        }
        
        while(k > 0)
        {
            k--;
            num++;
        }
        
        
        return num-1;
    }
}