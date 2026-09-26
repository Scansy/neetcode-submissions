func isValidSudoku(board [][]byte) bool {
	rows := make([]map[byte]bool, 9)
	cols := make([]map[byte]bool, 9)
	grids := make([]map[byte]bool, 9)

	for i := 0; i < 9; i++ {
		rows[i] = make(map[byte]bool)
		cols[i] = make(map[byte]bool)
		grids[i] = make(map[byte]bool)
	}

	for i, c := range board {
		for j, r := range c {
			if string(r) == "." {
				continue
			}
			// check rows
			_, existsR := rows[j][r]
			if (!existsR) {
				rows[j][r] = true
			} else {
				return false
			}

			// check cols
			_, existsC := cols[i][r] 
			if (!existsC) {
				cols[i][r] = true
			} else {
				return false
			}

			// checks grids
			_, existsG := grids[(i/3) * 3+ j/3][r]
			if (!existsG) {
				grids[(i/3) * 3+ j/3][r] = true
			} else {
				return false
			}
		}
	}
	return true
}
