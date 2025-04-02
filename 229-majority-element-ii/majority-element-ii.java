class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List <Integer> list = new ArrayList<>();
        int n = nums.length;
        Map <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mp : map.entrySet())
        {
            int element = mp.getKey();
            int value = mp.getValue();

            if(value > n/3)
            {
                list.add(element);
            }
        }
        return list;
    }
}