package main.algorithms

// https://leetcode.com/problems/fruit-into-baskets/
class FruitsIntoBaskets {

    fun maxNumberOfTwoFruits(threes: IntArray, k: Int): Int{
        var start = 0
        var max = 0
        val hashMap = mutableMapOf<Int, Int>()
        for ((end, fruit) in threes.withIndex()){
            if (hashMap.size <= k){
                hashMap[fruit] = end
            }

            while (hashMap.size > k){
                val removedItem = hashMap.values.minOrNull()
                start = removedItem!! + 1
                hashMap.values.remove(removedItem)
            }
            max = Math.max(max, end - start + 1)
        }

        return max
    }

}