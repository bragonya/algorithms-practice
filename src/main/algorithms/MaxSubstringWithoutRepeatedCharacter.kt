package main.algorithms

// problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/
class MaxSubstringWithoutRepeatedCharacter {

    fun process(string: String): String {

        var downPointer = 0
        val setForLetter = mutableSetOf<Char>()
        var maxSubstring = ""
        for(upPointer in string.indices){
            val currentLetter = string[upPointer]
            if (!setForLetter.contains(currentLetter)){
                maxSubstring = if(maxSubstring.length < upPointer-downPointer+1) string.substring(downPointer, upPointer+1) else maxSubstring
                setForLetter.add(currentLetter)
            }else{
                while (setForLetter.contains(currentLetter)){
                    setForLetter.remove(string[downPointer])
                    downPointer++
                }
            }
        }

        return maxSubstring
    }

    fun process2(string: String): String {

        var downPointer = 0
        val setForLetter = mutableSetOf<Char>()
        var maxSubstring = ""
        val buffer = StringBuffer()
        for(upPointer in string.indices){
            val currentLetter = string[upPointer]
            if (!setForLetter.contains(currentLetter)){
                buffer.append(currentLetter)
                maxSubstring = if(maxSubstring.length < upPointer-downPointer+1) buffer.toString() else maxSubstring
                setForLetter.add(currentLetter)
            }else{
                while (setForLetter.contains(currentLetter)){
                    setForLetter.remove(string[downPointer])
                    buffer.removeRange(0..0)
                    downPointer++
                }
            }
        }

        return maxSubstring
    }
}