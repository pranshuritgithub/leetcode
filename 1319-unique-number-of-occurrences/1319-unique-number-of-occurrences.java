class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(int count : map.values())
        {
            if(set.contains(count))
            {
                return false;
            }
            set.add(count);
        }
        return true;
    }
}