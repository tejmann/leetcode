fun main() {


    fun sumSquares(n: Int): Int {
        return if (n / 10 == 0) n * n
        else (n % 10) * (n % 10) + sumSquares(n / 10)
    }

    fun isHappy(n: Int): Boolean {
        val seenNumbers = hashMapOf<Int, Char>()
        var num = sumSquares(n)
        while (num != 1) {
            if (seenNumbers.containsKey(num)) return false
            seenNumbers[num] = '0'
            num = sumSquares(num)
        }
        return true
    }

}