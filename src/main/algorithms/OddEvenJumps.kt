package main.algorithms

class OddEvenJumps {

    fun oddEvenJumps(arr: IntArray): Int {

        val cache = mutableMapOf<Pair<Int,Boolean>, Boolean>()

        fun helper(currentIndex: Int, realIndex: Int): Boolean {
            val isEven = currentIndex % 2 == 0
            if(cache.contains(realIndex to isEven)) {
                return cache[realIndex to isEven]!!
            }

            if(realIndex == arr.lastIndex) return true


            if(isEven){ // even number
                val value = findMaxLowerOrEquals(arr[realIndex], arr, realIndex)
                if(value < 0) return false
                val result = helper(currentIndex + 1, value)
                cache[realIndex to true] = result
                return result
            }else{ // odd number
                val value = findMinUpperOrEquals(arr[realIndex], arr, realIndex)
                if(value < 0) return false
                val result = helper(currentIndex + 1, value)
                cache[realIndex to false] = result
                return result
            }
        }

        var goodStart = 0
        for(i in arr.indices.reversed()){

            if(helper(1, i)) goodStart++

        }

        return goodStart
    }

    fun findMinUpperOrEquals(n: Int, arr: IntArray, realIndex: Int): Int{
        var selectedNumber = Integer.MAX_VALUE
        var selectedIndex = -1
        for(j in realIndex+1 until arr.size){
            if(arr[j] >= n && arr[j] < selectedNumber){
                selectedNumber = arr[j]
                selectedIndex = j
            }
        }

        return selectedIndex
    }

    fun findMaxLowerOrEquals(n: Int, arr: IntArray, realIndex: Int): Int {
        var selectedNumber = -1
        var selectedIndex = -1
        for(j in realIndex+1 until arr.size){
            if(arr[j] <= n && arr[j] > selectedNumber){
                selectedNumber = arr[j]
                selectedIndex = j
            }
        }

        return selectedIndex
    }
}