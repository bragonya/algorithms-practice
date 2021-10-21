package main.algorithms

//problem: https://leetcode.com/discuss/interview-question/402014/IBM-or-OA-2019-or-Parking-Dilemma

class ParkingDilemma(){

    fun getMinLengthOfRoof(slots: IntArray, k: Int): Int{ // Time complexity nlog(n) because of the sort

        val sortedSlots = slots.sorted()
        var min = Int.MAX_VALUE

        for(i in 0..sortedSlots.size-k){
            val currentLength = sortedSlots[i + k -1] - sortedSlots[i]
            min = Math.min(min, currentLength)
        }
        return min + 1
    }
}