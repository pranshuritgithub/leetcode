class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for (String str : arr) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            
            map.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}