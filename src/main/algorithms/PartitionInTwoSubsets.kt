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

    fun canPartition(nums: IntArray, k: Int): Boolean {
        if (nums.sum() % k != 0) return false

        val initialTargetSum = nums.sum()/k
        val visited = mutableSetOf<Int>()

        fun backTracking(index: Int, target: Int, k: Int): Boolean {
            when {
                k == 1 -> return true
                0 == target -> {
                    return backTracking(0, initialTargetSum, k-1)
                }
                target < 0 -> return false
                index > nums.lastIndex -> return false
                else -> {
                    for (i in index .. nums.lastIndex){
                        if(!visited.contains(i)){
                            visited.add(i)
                            if (backTracking(i + 1, target - nums[i], k)) return true
                            visited.remove(i)
                        }
                    }

                    return false
                }
            }
        }


        return backTracking(0, initialTargetSum, k)
    }
}