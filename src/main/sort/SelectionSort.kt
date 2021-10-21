package main.sort

class SelectionSort {

    fun sort(array: IntArray): List<Int> {
        val mutableArray = array.toMutableList()
        for (i in array.indices){
            var minIndex = i
            var minValue = mutableArray[i]
            for(j in i+1 .. mutableArray.indices.last) {
                val currentElement = mutableArray[j]
                if(currentElement < minValue) {
                    minValue = currentElement
                    minIndex = j
                }
            }

            mutableArray.removeAt(minIndex)
            mutableArray.add(i, minValue)
        }

        return mutableArray
    }
}