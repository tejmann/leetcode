fun lengthOfLongestSubstring(s: String): Int {
    var currIndex = 0
    var startIndex = 0
    var lastStartIndex = 0
    var ans = 0
    val hash = hashMapOf<Char, Int>()
    for (a in s) {
        if (hash.containsKey(a)) {
            startIndex = maxOf(hash[a]!! + 1, lastStartIndex)
            lastStartIndex = startIndex
        }
        if (currIndex + 1 - startIndex > ans) ans = currIndex + 1 - startIndex
        hash[a] = currIndex
        currIndex += 1
    }
    return ans
}
