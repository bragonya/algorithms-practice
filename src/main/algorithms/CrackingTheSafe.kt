package main.algorithms

class CrackingTheSafe {

    // problem: https://leetcode.com/problems/cracking-the-safe/
    fun crackSafe(n: Int, k: Int): String{

        val seen = mutableSetOf<String>()
        val output = StringBuilder()

        fun backtracking(chain: String){
            for(i in 0 until k){
                val combination = chain + i
                if(!seen.contains(combination)){
                    seen.add(combination)
                    backtracking(combination.substring(1))
                    output.append(i)
                }
            }
        }

        val start = (1 until n).map{ "0" }.joinToString("")
        backtracking(start)
        output.append(start)

        return output.toString()
    }
}