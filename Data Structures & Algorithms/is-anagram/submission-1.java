class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap, tMap;
        sMap = makeCountMap(s);
        tMap = makeCountMap(t);
        return sMap.equals(tMap);
    }

    private Map<Character, Integer> makeCountMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char v : s.toCharArray()) {
            if (map.get(v) == null) {
                map.put(v, 1);
            } else {
                map.put(v, map.get(v) + 1);
            }
        }
        return map;
    }
}
