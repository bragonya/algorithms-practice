package main.algorithms

// problem: https://leetcode.com/problems/permutations/
class Permutations {

    fun getPermutations(array: IntArray): List<List<Int>> {
        return permutation(array)
    }

    private fun permutation(array: IntArray): List<List<Int>> {
        if(array.size == 1){
            return listOf(array.toList())
        }else {
            val outPut = mutableListOf<List<Int>>()
            array.forEachIndexed { index, item ->
                val temporalArray = array.toMutableList()
                val removedItem = temporalArray.removeAt(index)
                val currentBranch = permutation(temporalArray.toIntArray()).toMutableList()
                currentBranch.forEach { innerList ->
                    val mList = innerList.toMutableList()
                    mList.add(removedItem)
                    outPut.add(mList)
                }
            }
            return outPut
        }
    }

}