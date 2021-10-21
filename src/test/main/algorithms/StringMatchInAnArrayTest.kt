package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class StringMatchInAnArrayTest {

    @Test
    fun testBasicMatchInAnArray(){

        assertArrayEquals(arrayOf("as","hero"), StringMatchInAnArray().stringMatching(arrayOf("mass","as","hero","superhero")))
    }
}