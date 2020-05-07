fun main() {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val hash = hashMapOf<Int, String>()
        val temp = mutableListOf<HashMap<Int, Char>>()
        val ans = mutableListOf<MutableList<Int>>()
        var i = 0
        while (i < nums.size) {
            var j = i + 1
            while (j < nums.size) {
                var k = j + 1
                while (k < nums.size) {
                    val requiredNum = target - nums[i] - nums[j] - nums[k]
                    if (hash[nums[k]] != null) {
                        ans.add(mutableListOf(nums[i], nums[j], nums[k], requiredNum))
                    } else {
                        hash[requiredNum] = ""
                    }
                    k += 1
                }
                j += 1
            }
            i += 1
        }

        for (list in ans) {
            list.distinct()
        }
        return ans
    }
}