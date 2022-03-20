package main.algorithms

//problem: https://leetcode.com/problems/string-to-integer-atoi/
class Atoi {
    fun myAtoi(s: String): Int {
        val s = s.toCharArray()
        var result = 0.toLong()
        var atLeastOneDigit = false
        var sign = '/'
        looper@ for(c in s){
            when {
                c == '-' || c == '+' -> {
                    if(atLeastOneDigit) break@looper
                    if(sign == '/') sign = c
                    else break@looper
                }
                isDigit(c) -> {
                    val digit = (c - '0')
                    result *= 10
                    result += digit
                    atLeastOneDigit = true
                }
                c == ' ' -> {
                    if(atLeastOneDigit || sign != '/') break@looper
                }
                else -> {
                    break@looper
                }
            }


            if(result > Int.MAX_VALUE) {
                return if(sign== '-') Int.MIN_VALUE else Int.MAX_VALUE
            }
        }

        if(sign == '-') result *= -1

        return result.toInt()
    }

    fun isDigit(c: Char) = c in '0'..'9'
}