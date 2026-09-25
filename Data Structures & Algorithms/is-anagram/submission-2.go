import "slices"

func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}

	sB := []byte(s)
	tB := []byte(t)
	slices.Sort(sB)
	slices.Sort(tB)
	sortedS := string(sB)
	sortedT := string(tB)
	return sortedS == sortedT
}
