import kotlin.math.sqrt

fun main() {

    fun countPrimes(n: Int): Int {
        if (n == 0 || n == 1 || n == 2) return 0
        val list = BooleanArray(n)
        for (i in 2 until n) {
            list[i] = true
        }
        var i = 2
        while (i * i < n) {
            if (list[i]) {
                var j = i * i
                while (j <= n - 1) {
                    list[j] = false
                    j += i
                }
            }
            i++
        }
        var ans = 0
        for (l in list) {
            if (l) ans += 1
        }
        return ans
    }
}