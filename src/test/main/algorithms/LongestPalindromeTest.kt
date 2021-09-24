package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class LongestPalindromeTest {

    @Test
    fun testSubstring(){
        assertEquals(
            "abba",
            LongestPalindrome().findLongestPalindrome("aabba")
        )
    }

    @Test
    fun testSubstringMiddle(){

        assertEquals(
            "bb",
            LongestPalindrome().findLongestPalindrome("cbbd")
        )
    }

    @Test
    fun testSubstringSolution2(){
        assertEquals(
            "abba",
            LongestPalindrome().longestPalindromeSolution2("aabba")
        )
    }

    @Test
    fun testSubstringMiddleSolution2(){

        assertEquals(
            "bb",
            LongestPalindrome().longestPalindromeSolution2("cbbd")
        )
    }
}