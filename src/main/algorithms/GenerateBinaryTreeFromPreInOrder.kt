package main.algorithms

import main.threes.common.Node

class GenerateBinaryTreeFromPreInOrder {

    fun solve (preOrder: IntArray, inOrder:IntArray): Node? {
        val preOrden = preOrder.toMutableList()


        fun generateTree(arr: IntArray): Node?{
            if(arr.isEmpty()) return null
            val current = arr.indexOf(preOrden[0])
            val subTreeLeft = arr.slice(0 until current)
            val subTreeRight = arr.slice(current+1 until arr.size)
            val currentNode = Node(preOrden.removeAt(0))


            currentNode.left = generateTree(subTreeLeft.toIntArray())
            currentNode.right = generateTree(subTreeRight.toIntArray())

            return currentNode
        }

        return generateTree(inOrder)
    }
}