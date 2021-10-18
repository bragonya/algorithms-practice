package main.algorithms

import main.benchmark.calculateTime
import org.junit.Assert.*
import org.junit.Test

class PownTest {

    @Test
    fun testPown(){

        calculateTime("func1") {

            assertEquals(
                1024,
                Pown().pow2(2.toDouble(),10)
            )
        }
        calculateTime("func2") {

            assertEquals(
                1024,
                Pown().pow2(2.toDouble(),10)
            )
        }

    }

    @Test
    fun testPownBig(){

        calculateTime("func1") {

            assert(
                8192.toDouble() == Pown().pow2(2.toDouble(),13)
            )
        }
        calculateTime("func2") {

            assert(
                8192.toDouble() == Pown().pow2(2.toDouble(),13)
            )
        }

    }


    @Test
    fun testNegative(){
        calculateTime("func2") {

            assert(
                0.000025005483472 == Pown().pow3(3.76050,-8)
            )
        }
    }


}