package main.algorithms

import com.sun.javaws.exceptions.InvalidArgumentException

// problem: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
class LetterCombinationsOfAPhoneNumber {

    fun letterCombinations(digits: String): List<String> {

        if(digits.isEmpty()) return emptyList()
        val output = mutableListOf<String>()
        fun backTracking(i: Int, carry: String) {
            if(carry.length == digits.length){
                output.add(carry)
            }else{
                val currentDigit = digits[i]
                val letters = digitToLetters(currentDigit)

                letters.forEach { letter ->
                    backTracking(i+1, carry.plus(letter))
                }
            }
        }

        backTracking(0, "")

        return output
    }



    private fun digitToLetters(digit: Char): String {
        return when(digit){
            '2' -> "abc"
            '3' -> "def"
            '4' -> "ghi"
            '5' -> "jkl"
            '6' -> "mno"
            '7' -> "pqrs"
            '8' -> "tuv"
            '9' -> "wxyz"
            else -> throw Exception()
        }

    }
}