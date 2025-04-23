class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        int end = intervals[0][1];
        int count = 1;

        for(int i=0;i<n;i++)
        {
            if(intervals[i][0] >= end)
            {
                end = intervals[i][1];
                count++;
            }
        }
        return n-count;
    }
}