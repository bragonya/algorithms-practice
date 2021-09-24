package main.threes

import main.threes.common.print
import org.junit.Assert.*
import org.junit.Test

class BinaryThreeTest {


    @Test
    fun testHeight(){
        val three = BinaryThree()

        three.insert(5)
        three.insert(2)
        three.insert(1)
        three.insert(3)
        three.insert(8)

        assertEquals(2, three.getHeight())
    }

    @Test
    fun testHeightDeeper(){
        val three = BinaryThree()

        three.insert(5)
        three.insert(2)
        three.insert(1)
        three.insert(3)
        three.insert(8)
        three.insert(4)

        assertEquals(3, three.getHeight())
    }

    @Test
    fun testPrintBinaryThree(){
        val three = BinaryThree()

        three.insert(5)
        three.insert(2)
        three.insert(1)
        three.insert(3)
        three.insert(8)
        three.insert(4)

        three.print()
    }
}