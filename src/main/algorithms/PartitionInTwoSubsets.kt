package main.algorithms

class PartitionInTwoSubsets {

    fun canPartition(nums: IntArray): Boolean {
        val sum: Int = nums.sum()
        val memo = hashSetOf<Int>()
        if (sum % 2 != 0) return false

        fun helper(target: Int, index: Int, nums: IntArray): Boolean {
            if (memo.contains(target) || target < 0) return false
            if (target == 0) return true

            memo.add(target)

            for (i in index .. nums.lastIndex) {
                if (helper(target - nums[i], i + 1, nums)) return true
            }
            return false
        }
        return  helper(sum / 2, 0, nums)
    }
    fun canPartition2(nums: IntArray): Boolean {
        if (nums.sum() % 2 != 0) return false

        fun backTracking(carry: Int, index: Int, target: Int): Boolean {
            val currentNum = nums[index]

            when {
                currentNum == target -> return true
                currentNum > target -> return false
                index == nums.lastIndex -> return false
                else -> {
                    val newTarget = target - currentNum
                    if(backTracking(currentNum+carry, index+1, newTarget)) return true
                    if(backTracking(carry, index+1, target)) return true
                    return false
                }
            }
        }


        return backTracking(0, 0, nums.sum()/2)
    }
}