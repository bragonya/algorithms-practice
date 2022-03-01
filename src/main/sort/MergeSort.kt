package main.sort

class MergeSort {


    fun sort(array: IntArray): IntArray{

        fun helper(l: Int, r: Int): MutableList<Int>{
            if(l < r) {
                val mid = (l+r) / 2
                val a = helper(l, mid)
                val b = helper(mid + 1, r)
                return merge(a, b)
            }
            return array.slice(l..r).toMutableList()
        }

        return helper(0, array.lastIndex).toIntArray()
    }

    private fun merge(a: MutableList<Int>, b: MutableList<Int>): MutableList<Int>{
        val output = mutableListOf<Int>()

        while(a.isNotEmpty() || b.isNotEmpty()) {
            val headA = a.firstOrNull() ?: Int.MAX_VALUE
            val headB = b.firstOrNull() ?: Int.MAX_VALUE

            if (headA < headB) {
                output.add(headA)
                a.removeFirst()
            } else {
                output.add(headB)
                b.removeFirst()
            }
        }
        return output
    }
}