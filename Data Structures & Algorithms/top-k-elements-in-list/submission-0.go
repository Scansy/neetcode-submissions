func topKFrequent(nums []int, k int) []int {
	if len(nums) == 1{
		return nums
	}
	countSlice := make([][]int, len(nums) + 1)
	countMap := make(map[int]int)
	var result []int

	for _, v := range nums {
		countMap[v]++
	}
	for num, count := range countMap {
		countSlice[count] = append(countSlice[count], num)
	}

	for i := len(nums); i > 0; i-- {
		for _, num := range countSlice[i] {
			result = append(result, num)
			if len(result) == k {
				return result
			}
		}
	}
	return result
}
