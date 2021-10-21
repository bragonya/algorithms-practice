package main.algorithms

// Simple search in string given a word, you have to return the initial position of each match.
class SearchInString {

    fun getPositionOfString(string: String, search: String): IntArray {

        var initialPosition = 0
        var positionIndicator = 0
        val output = mutableListOf<Int>()
        val lastCharOfSearch = search.last()
        val firstCharOfSearch = search.first()
        string.forEachIndexed { index, currentChar ->
            val desiredChar = search[positionIndicator]
            if(currentChar == firstCharOfSearch) initialPosition = index
            if(currentChar == desiredChar){
                positionIndicator++
                if(desiredChar == lastCharOfSearch){
                    output.add(initialPosition)
                    positionIndicator = 0
                }
            }else{ positionIndicator = 0 }
        }
        return output.toIntArray()
    }
}