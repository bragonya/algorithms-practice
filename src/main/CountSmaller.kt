package main

//problem: https://leetcode.com/problems/count-of-smaller-numbers-after-self/
class CountSmaller {

    fun solve(array: IntArray): IntArray {
        val solutions = IntArray(array.size, {0})

        fun merge(a: MutableList<Pair<Int,Int>>, b: MutableList<Pair<Int, Int>>): MutableList<Pair<Int, Int>>{
            val output = mutableListOf<Pair<Int, Int>>()

            var rightSideSmallerCount = 0
            while(a.isNotEmpty() || b.isNotEmpty()) {
                val headA = a.firstOrNull()
                val headB = b.firstOrNull()

                if(headA == null) {
                    output.addAll(b)
                    break
                }
                if(headB == null) {
                    while (a.isNotEmpty()){
                        val node = a.removeAt(0)
                        solutions[node.first] += rightSideSmallerCount
                        output.add(node)
                    }
                    break
                }

                if (headA.second <= headB.second) {
                    solutions[headA.first] += rightSideSmallerCount
                    output.add(headA)
                    a.removeAt(0)
                } else {
                    rightSideSmallerCount += 1
                    output.add(headB)
                    b.removeAt(0)
                }
            }
            return output
        }

        fun sort(array: MutableList<Pair<Int, Int>>){

            fun helper(l: Int, r: Int): MutableList<Pair<Int, Int>>{
                if(l < r) {
                    val mid = (l+r) / 2
                    val a = helper(l, mid)
                    val b = helper(mid + 1, r)
                    return merge(a, b)
                }
                return array.slice(l..r).toMutableList()
            }
            helper(0, array.lastIndex)
        }

        sort(array.mapIndexed { index, item -> index to item }.toMutableList())

        return solutions
    }
}