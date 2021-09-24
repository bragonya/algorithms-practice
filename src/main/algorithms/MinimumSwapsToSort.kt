package main.algorithms

// phone: https://leetcode.com/discuss/interview-question/346621/Google-or-Phone-Screen-or-Min-swaps-to-sort-array
class MinimumSwapsToSort {

    fun getMinSwapsToSort(array: IntArray): Int {

        val arrayWithIndex = array.mapIndexed { index, item -> item to index }
        val sortedArray = arrayWithIndex.sortedBy { (item, _) -> item }

        var ans = 0

        val visited = array.map { false }.toMutableList()
         for (realPosition in sortedArray.indices) {
             val (item, oldPosition) = sortedArray[realPosition]
             if(visited[realPosition] || realPosition == oldPosition) continue

             var cycle = 0
             var node = realPosition

             while (!visited[node]){
                 visited[node] = true
                 node = sortedArray[node].second
                 cycle += 1
             }

             ans += cycle - 1
        }

        return ans
    }
}