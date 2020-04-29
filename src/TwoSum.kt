fun twoSum(nums: IntArray, target: Int): IntArray {
    val ans = hashMapOf<Int, Int>()
    var index = 0

    for (n in nums) {
        if (ans.containsKey(n)) {
            return intArrayOf(ans[n]!!, index)
        } else {
            val diff = target - n
            ans[diff] = index
        }
        index += 1
    }
    return intArrayOf()
}
