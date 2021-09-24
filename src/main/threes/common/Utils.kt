package main.threes.common

import main.threes.BinaryThree

fun BinaryThree.print(){
    fun printCurrentLevel (currentNode: Node?, level: Int) {
        if (currentNode == null)
            return
        if (level == 0)
            System.out.print("${currentNode.value} ")
        else if (level > 0)
        {
            printCurrentLevel(currentNode.left, level-1);
            printCurrentLevel(currentNode.right, level-1);
        }
    }

    for(i in 0..getHeight()){
        println("------------- LEVEL $i -----------------")
        printCurrentLevel(root, i)
        println()

    }
}