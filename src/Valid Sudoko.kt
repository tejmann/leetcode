fun main() {
    //could be improved if we find a better way to get boxIndex
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val colHash = hashMapOf<Int, HashMap<Char, Char>>()
        val boxHash = hashMapOf<Pair<Int, Int>, HashMap<Char, Char>>()
        var rowIndex = 0
        for (row in board) {
            val rowHash = hashMapOf<Char, Char>()
            var colIndex = 0
            for (char in row) {
                if (char != '.') {
                    val boxIndex = Pair(rowIndex / 3, colIndex / 3)
                    if (rowHash.containsKey(char)) {
                        return false
                    } else {
                        rowHash[char] = '0'
                        if (colHash[colIndex] == null) colHash[colIndex] = hashMapOf(Pair(char, '0'))
                        else {
                            if (colHash[colIndex]!!.containsKey(char)) {
                                return false
                            } else {
                                colHash[colIndex]!![char] = '0'
                            }
                        }
                        if (boxHash[boxIndex] == null) boxHash[boxIndex] = hashMapOf(Pair(char, '0'))
                        else {
                            if (boxHash[boxIndex]!!.containsKey(char)) {
                                return false
                            } else {
                                boxHash[boxIndex]!![char] = '0'
                            }
                        }
                    }
                }
                colIndex += 1
            }
            rowIndex += 1
        }
        return true
    }

    val board = arrayOf(
        charArrayOf('.', '.', '.', '.', '5', '.', '.', '1', '.'),
        charArrayOf('.', '4', '.', '3', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '3', '.', '.', '1'),

        charArrayOf('8', '.', '.', '.', '.', '.', '.', '2', '.'),
        charArrayOf('.', '.', '2', '.', '7', '.', '.', '.', '.'),
        charArrayOf('.', '1', '5', '.', '.', '.', '.', '.', '.'),

        charArrayOf('.', '.', '.', '.', '.', '2', '.', '.', '.'),
        charArrayOf('.', '2', '.', '9', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '4', '.', '.', '.', '.', '.', '.')
    )
    isValidSudoku(board)
}


