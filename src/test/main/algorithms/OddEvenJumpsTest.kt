package main.algorithms

import com.sun.org.apache.xpath.internal.operations.Bool
import org.junit.Assert.*
import org.junit.Test

class OddEvenJumpsTest{

    @Test
    fun baseOddEvenJumps(){
        assertEquals(
            5,
            OddEvenJumps().oddEvenJumps(intArrayOf(2,3,1,1,4,2,3,1,1,4))
        )
        assertEquals(
            2,
            OddEvenJumps().oddEvenJumps(intArrayOf(10,13,12,14,15))
        )
    }
}