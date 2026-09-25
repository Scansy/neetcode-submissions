import (
    "slices"
    "maps"
)

func groupAnagrams(strs []string) [][]string {
    result := make(map[[26]int][]string)

    for _, str := range strs {
        var count [26]int
        for _, char := range str {
            count[char - 'a']++
        }
        result[count] = append(result[count], str)
    }
    res := slices.Collect(maps.Values(result))
    return res
}
