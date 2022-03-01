package main.algorithms

// problem: https://leetcode.com/problems/zigzag-conversion/submissions/
class ZigZagConversion {

    fun convert(s: String, numRows: Int): String {
        if(numRows <= 1) return s
        val alpha = numRows - 2
        val epsilon = numRows + alpha
        val nColums = s.length/epsilon + 1

        val sBuilder = StringBuilder()
        for(r in 0 until numRows){

            for(i in 0 until nColums){
                if(r + epsilon*i < s.length) sBuilder.append(s[r + epsilon*i])
                val diagonalPosition = epsilon*(i+1) - r
                if(r > 0 && r < numRows - 1 && diagonalPosition < s.length){
                    sBuilder.append(s[diagonalPosition])
                }

            }
        }

        return sBuilder.toString()
    }
}