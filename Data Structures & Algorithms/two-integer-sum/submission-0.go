func twoSum(nums []int, target int) []int {
    differences := make(map[int]int) 

	for i, v := range nums {
		diff := target - v
		j, exists := differences[diff]
		if exists {
			return []int{j, i}
		}
		differences[v] = i
	}
	return []int{}
}
