package main.algorithms

import kotlin.math.max

class MaximumLevelSumOfBinaryTree {
    fun maxLevelSum2(root: TreeNode?): Int {
        if (root == null) return 0
        val queue = mutableListOf<Pair<Int, TreeNode>>()
        val counter = hashMapOf<Int, Int>()
        queue.add(1 to root)


        while (queue.isNotEmpty()) {
            val (level, currentNode) = queue.removeAt(queue.lastIndex)

            counter.put(level, counter.getOrDefault(level, 0) + currentNode.`val`)
            currentNode.left?.let {newNode ->
                queue.add(level + 1 to newNode)
            }

            currentNode.right?.let { newNode ->
                queue.add(level + 1 to newNode)
            }
        }

        var maxSum = Int.MIN_VALUE
        var maxLevel = 0
        counter.forEach { level, sum ->
            if (sum >= maxSum) {
                maxSum = sum
                maxLevel = level
            }
        }

        return maxLevel
    }

    fun maxLevelSum(root: TreeNode?): Int {
        if (root == null) return 0
        val queue = mutableListOf<TreeNode>()
        queue.add(root)

        var level = 1
        var maxSum = Integer.MIN_VALUE
        var maxLevel = 0
        while (queue.isNotEmpty()) {

            var tempSum = 0
            val levelTimes =queue.size
            repeat(levelTimes) {
                val currentNode = queue.removeAt(0)
                tempSum+= currentNode.`val`
                currentNode.left?.let {newNode ->
                    queue.add(newNode)
                }

                currentNode.right?.let { newNode ->
                    queue.add(newNode)
                }
            }

            if(tempSum > maxSum) {
                maxSum = tempSum
                maxLevel = level
            }
            level++

        }

        return maxLevel
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}