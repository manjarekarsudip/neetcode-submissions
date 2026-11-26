class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            res.putIfAbsent(sortedKey, new ArrayList<>());
            res.get(sortedKey).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
