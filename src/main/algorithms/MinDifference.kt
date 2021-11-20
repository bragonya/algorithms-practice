package main.algorithms

class MinDifference {

    fun minDifference(nums: IntArray): Int {
        if(nums.size <= 4) return 0
        var i = 0
        var j = nums.lastIndex

        val sortedNums = nums.sorted()

        for(replaces in (1..3).reversed()){
            val lowAmplitude = sortedNums[j - replaces] - sortedNums[i]
            val highAmplitude = sortedNums[j] - sortedNums[i + replaces]
            if(lowAmplitude >  highAmplitude){
                i++
            }else{
                j--
            }
        }

        return sortedNums[j] - sortedNums[i]
    }
}