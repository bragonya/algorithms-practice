package main.algorithms

import main.threes.common.Node
import main.threes.common.generatePreOrder
import org.junit.Assert.*
import org.junit.Test

class GenerateBinaryTreeFromPreInOrderTest{

    @Test
    fun generateTree(){


        assertArrayEquals(
            intArrayOf(50,110,30,15,36,18,9,25,20,40,31,8,220,55,14,11,16,17,12,69,96,101,98,76,27,219,218),
            GenerateBinaryTreeFromPreInOrder().solve(
                intArrayOf(50,110,30,15,36,18,9,25,20,40,31,8,220,55,14,11,16,17,12,69,96,101,98,76,27,219,218),
                intArrayOf(15,9,18,36,30,110,31,40,20,8,25,14,55,11,220,50,17,12,101,96,69,16,76,98,219,27,218)
            )?.generatePreOrder()
        )
    }


    @Test
    fun ascii(){
        println('b'.code - 96)
    }
}