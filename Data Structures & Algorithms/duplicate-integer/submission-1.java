class Solution {
    public boolean hasDuplicate(int[] nums) {
      Map<Integer, Boolean> map = new HashMap<>();
	  for (int v : nums) {
		if (map.get(v) != null) {
			return true;
		}
		map.put(v, true);
	  }  
	  return false;
    }
}