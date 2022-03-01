package main.algorithms

import java.lang.StringBuilder

class NQueens {


    fun solveNQueens(n: Int): List<List<String>> {
        val output: MutableList<MutableList<Int>> = mutableListOf()
        fun backtracking(state: MutableList<Int>){
            if(state.size==n){
                output.add(state.map { it }.toMutableList())
                return
            }
            for (p in 0 until n){
                if(validateState(state, state.size to p)){
                    state.add(p)
                    backtracking(state)
                    state.remove(p)
                }
            }
        }

        backtracking(mutableListOf())
        return output.map { it.map { i ->
            val str = StringBuilder()
            for(k in 0 until n){
                if (k == i){
                    str.append("Q")
                }else{
                    str.append(".")
                }
            }
            str.toString()
        } }
    }

    fun validateState(state: MutableList<Int>, point: Pair<Int,Int>): Boolean{
        if(state.contains(point.second))return false // same column
        state.forEachIndexed { index, i ->
            if(Math.abs(point.first - index) == Math.abs(point.second - i)) return false //same diagonal
        }
        return true
    }

}