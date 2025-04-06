class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int maxVal = arr[0];
        int minVal = arr[0];
        int result = arr[0];

        for(int i=1;i<n;i++)
        {
            if(arr[i] < 0)
            {
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }
            maxVal = Math.max(arr[i],maxVal*arr[i]);
            minVal = Math.min(arr[i],minVal*arr[i]);
            result = Math.max(result,maxVal);
        }
        return result;
    }
}