package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class SearchInStringTest {

    @Test
    fun testSearchingOfString(){
        assertArrayEquals(intArrayOf(12,29), SearchInString().getPositionOfString("I liked the movie, acting in movie was great!", "movie"))
    }
}