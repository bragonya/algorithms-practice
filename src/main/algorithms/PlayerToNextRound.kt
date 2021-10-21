package main.algorithms

import java.util.*
import kotlin.collections.HashMap

// Given an array of scores of players and a number key which is the number of players allowed to past to the next round
// return the number of players involved in a game that will be advancing to the next round
class PlayerToNextRound {

    fun numOfPlayers(scores: IntArray, k: Int): Int { //O(n) complexity
        if(k == 0) return 0
        val priorityQueue = PriorityQueue<Int>()
        val timesPerNumber = HashMap<Int, Int>()
        scores.forEach { currentScore ->
            if(timesPerNumber[currentScore] == null) {
                timesPerNumber.set(currentScore, 1)
                if (priorityQueue.size < k){
                    priorityQueue.add(currentScore)
                }else{
                    val candidateToBeRemoved: Int = priorityQueue.remove()
                    priorityQueue.add(Math.max(candidateToBeRemoved, currentScore))
                }
            }else{
                timesPerNumber.set(currentScore, timesPerNumber[currentScore]!!.plus(1))
            }


        }

        return priorityQueue.sumBy { timesPerNumber[it] ?: 0 }
    }
}