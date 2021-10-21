package main.algorithms

class StringWindow {

    fun getSmallestStringWindow(bigString: String, smallString: String) : String? {
        val referenceMap = HashMap<Char, Int>()

        smallString.forEach {
            referenceMap[it] = referenceMap[it]?.plus(1) ?: 1
        }

        val targetLength = referenceMap.size
        var smallestString: String? = null
        val stringBuilder = StringBuilder()
        var counter = 0
        for(i in bigString.indices){
            val currentChar = bigString[i]
            stringBuilder.append(currentChar)
            if(referenceMap.contains(currentChar)){
                referenceMap[currentChar] = referenceMap[currentChar]!!.minus(1)
                if (referenceMap[currentChar] == 0) counter++
            }

            while (counter >= targetLength) {
                if(smallestString?.length ?: Integer.MAX_VALUE > stringBuilder.length) smallestString = stringBuilder.toString()
                val firstChar =stringBuilder[0]
                stringBuilder.deleteCharAt(0)
                if(referenceMap.contains(firstChar)){
                    referenceMap[firstChar] = referenceMap[firstChar]!!.plus(1)
                    if(referenceMap[firstChar] == 1) counter--
                }
            }
        }

        return  smallestString

    }
}