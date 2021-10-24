package main.algorithms

class PartitionInTwoSubsets {

    fun canPartition(nums: IntArray): Boolean {
        if (nums.sum() % 2 != 0) return false
        val cache = hashSetOf<Int>()

        fun backTracking(index: Int, target: Int): Boolean {
            when {
                0 == target -> return true
                target < 0 || cache.contains(target) -> return false
                index > nums.lastIndex -> return false
                else -> {
                    cache.add(target)
                    for (i in index .. nums.lastIndex){
                        if(backTracking(i+1, target - nums[i])) return true
                    }

                    return false
                }
            }
        }


        return backTracking(0, nums.sum()/2)
    }
}