package main.algorithms

//problem: https://leetcode.com/problems/kth-largest-element-in-an-
class KthLargestElement {

    fun findKthLargest2(nums: IntArray, k: Int): Int {

        fun helper(p: Int, pivotIndex: Int): Int{

            val pivotNumber = nums[pivotIndex]
            var newPivotIndex = pivotIndex
            for(i in p .. pivotIndex){
                val currentNum = nums[i]
                if(currentNum > pivotNumber){
                    var j = i + 1
                    var nextLessOrEqualNumber = nums[j]
                    while (j < nums.lastIndex && pivotNumber < nextLessOrEqualNumber){
                        j++
                        nextLessOrEqualNumber = nums[j]
                    }
                    swap(nums, i, j)

                    newPivotIndex = i
                    if(j == pivotIndex) break
                }
            }
            return if(newPivotIndex == nums.size - k) nums[newPivotIndex]
            else if(nums.size - k < newPivotIndex) helper(0, newPivotIndex - 1)
            else helper(newPivotIndex + 1, nums.lastIndex)
        }

        return helper(0, nums.lastIndex)
    }


    fun findKthLargest(nums: IntArray, k: Int): Int {

        val k = nums.size - k
        fun helper(l: Int, r: Int): Int{

            val pivot = nums[r]
            var p = l
            for(i in l until r){
                if(nums[i] <= pivot){
                    swap(nums, i, p)
                    p += 1
                }
            }

            swap(nums, r, p)
            return if(k < p) helper(l, p - 1)
            else if(k > p) helper(p + 1, r)
            else nums[p]
        }

        return helper(0, nums.lastIndex)
    }



    private fun swap(nums: IntArray, a: Int, b: Int) {
        val temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp
    }
}
