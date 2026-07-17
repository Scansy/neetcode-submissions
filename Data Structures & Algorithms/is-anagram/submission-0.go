func isAnagram(s string, t string) bool {
	if len(t) != len(s) {
		return false
	}
	sMap := make(map[rune]int)
	tMap := make(map[rune]int)

	for _, r := range s {
		sMap[r]++
	}
	for _, r:= range t {
		tMap[r]++
	}

	for k, v := range sMap {
		inT, exists := tMap[k]
		if !exists || inT != v  {
			return false
		} 
	}
	return true
}
