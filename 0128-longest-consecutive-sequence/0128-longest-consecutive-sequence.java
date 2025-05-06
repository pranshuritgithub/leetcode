class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0) return 0;
        for(int num:nums){// we are implementing point 1 here
            set.add(num);
        }
        int count = 0; 
        for(int num:set){
            if(!set.contains(num - 1)){// we are checking point 2 here
                int curNum = num;
                int curStreak = 1;

                while(set.contains(curNum+1)){// we are implementing point 3 here 
                    curNum++;
                    curStreak++;
                }
                count = Math.max(count, curStreak); // point 4 
            }
        }
        return count;
    }
}