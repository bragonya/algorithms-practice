package main.algorithms

// problem: https://leetcode.com/problems/wiggle-sort-ii/
class WiggleSortII {

    fun wiggleSort(nums: IntArray): IntArray {

        sortByMedianPartition(nums)
        val output = IntArray(nums.size, {0})

        var j = nums.lastIndex
        for (i in (1..nums.lastIndex).step(2)){
            output[i] = nums[j--]
        }
        for (i in nums.indices.step(2)){
            output[i] = nums[j--]
        }
        return output
    }

    private fun sortByMedianPartition(nums: IntArray) {
        val k: Int = nums.size / 2

        fun helperPartition(l: Int, r: Int) {

            val pivot = nums[r]
            var p = l

            for (i in l until r) {
                if(nums[i] <= pivot){
                    swap(nums, i, p)
                    p += 1
                }
            }
            swap(nums, r, p)

            return when {
                k < p -> helperPartition(l, p -1)
                k > p -> helperPartition(p + 1, r)
                else -> {}
            }
        }

        return helperPartition(0, nums.lastIndex)
    }

    private fun swap(nums: IntArray, a: Int, b: Int) {
        val temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp
    }
}