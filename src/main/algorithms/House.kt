package main.algorithms

/**
 * Housing: Along one side of a road there is a sequence of vacand plots of land. Each plot has a different area (non-zero).
 * So, the areas from a sequence A[1], A[2],... A[n].
 *
 * You want to buy K acres of land to build a house. You want to find all segments of contiguous plots of whose sum is exactly K.
 *
 * Example input:
 * Plots = [1 3 2 1 4 1 3 2 1 1 2]
 * K = 8
 * Output:
 * [(2,5), (4,6), (5,9)]
 *
 * Explanation: For the first pair (2,5) you'll sum the all the middle positions
 * position 2: 2
 * position 3: 1
 * position 4: 1
 * position 5: 4
 * total sum of all positions: 8
 *
 * Same for all other positions inside the array.
 * */
class House {

    fun getPositions(areas: IntArray, target: Int) : List<Pair<Int, Int>> {

        var downPointer = 0
        val output = mutableListOf<Pair<Int, Int>>()

        for(upPointer in areas.indices){
            val currentSum = areas.slice(downPointer .. upPointer).sum()

            if (currentSum == target){
                output.add(downPointer to upPointer)
            }else if (currentSum > target){
                var temporalCurrentSum = currentSum
                while (temporalCurrentSum > target){
                    downPointer++
                    temporalCurrentSum = areas.slice(downPointer .. upPointer).sum()
                }

                if(temporalCurrentSum == target) output.add(downPointer to upPointer)
            }
        }

        return output
    }

    fun getPositionsWithPrefixSUm(areas: IntArray, target: Int) : List<Pair<Int, Int>> {

        var downPointer = 0
        val output = mutableListOf<Pair<Int, Int>>()
        var acc = 0
        val prefixSums = areas.map { i ->
            acc+= i
            acc
        }

        for(upPointer in areas.indices){
            val currentSum = prefixSums[upPointer] - if(downPointer-1 >=0) prefixSums[downPointer-1] else 0

            if (currentSum == target){
                output.add(downPointer to upPointer)
            }else if (currentSum > target){
                var temporalCurrentSum = currentSum
                while (temporalCurrentSum > target){
                    downPointer++
                    temporalCurrentSum = prefixSums[upPointer] - if(downPointer-1 >=0) prefixSums[downPointer-1] else 0
                }

                if(temporalCurrentSum == target) output.add(downPointer to upPointer)
            }
        }

        return output
    }
}