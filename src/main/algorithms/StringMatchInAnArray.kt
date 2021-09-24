package main.algorithms

// problem: https://leetcode.com/problems/string-matching-in-an-array/submissions/
class StringMatchInAnArray {

    fun stringMatching(words: Array<String>): Array<String> {
        val output = mutableSetOf<String>()
        for(i in 0 until words.size -1){
            val firstWord = words[i]
            for(j in i+1 until words.size){
                val secondWord = words[j]

                if(firstWord.length > secondWord.length){
                    if(firstWord.contains(secondWord)){
                        output.add(secondWord)
                    }
                }else{
                    if(secondWord.contains(firstWord)){
                        output.add(firstWord)
                    }
                }
            }
        }
        return output.toTypedArray()
    }
}