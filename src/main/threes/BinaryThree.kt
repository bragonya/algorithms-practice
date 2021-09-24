package main.threes

import main.threes.common.Node

class BinaryThree {

    var root: Node? = null


    fun insert(value: Int){

        fun internalInsert(currentNode: Node, value: Int) {
            if(currentNode.value == value) return
            if(currentNode.value < value){
                if(currentNode.right == null) {
                    currentNode.right = Node(value)
                }else{
                    internalInsert(currentNode.right!!, value)
                }
            }else {
                if(currentNode.left == null) {
                    currentNode.left = Node(value)
                }else{
                    internalInsert(currentNode.left!!, value)
                }
            }
        }

        if(root != null)
            internalInsert(root!!, value)
        else root = Node(value)
    }




    fun getHeight(): Int {
        var maxHeight = 0
        fun internalHeight(currentNode: Node, level: Int){
            if(currentNode.left == null && currentNode.right == null){
                maxHeight = Math.max(level, maxHeight)
            }

            if (currentNode.left != null) internalHeight(currentNode.left!!, level.plus(1))
            if (currentNode.right != null) internalHeight(currentNode.right!!, level.plus(1))
        }

        if (root == null) return 0
        internalHeight(root!!, 0)
        return maxHeight
    }
}