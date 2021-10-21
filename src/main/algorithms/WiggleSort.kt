package main.algorithms

// problem: https://leetcode.com/problems/wiggle-sort-ii/
class WiggleSort {

    fun wiggleSort(nums: IntArray): IntArray {
        var isPeek = true
        for(i in 1 until nums.size -1) {
            val prev = nums[i-1]
            val current = nums[i]
            val next = nums[i+1]
            if(isPeek){
                if(next > current && prev <= current  ){
                    nums[i] = next
                    nums[i+1] = current
                }else if(prev > current && current >= next){
                    nums[i - 1] = current
                    nums[i] = prev
                }else if(prev > current && next > current){
                    nums[i - 1] = current
                    nums[i] = prev
                }
            }else{
                if(prev < current && current <= next){
                    nums[i] = prev
                    nums[i-1] = current
                }else if(next < current && current <= prev){
                    nums[i] = next
                    nums[i+1] = current
                }else if(prev < current && next < current){
                    nums[i - 1] = current
                    nums[i] = prev
                }
            }

            isPeek = !isPeek
        }
        return nums
    }
}