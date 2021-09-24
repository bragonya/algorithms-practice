package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class MaxSubstringWithoutRepeatedCharacterTest {

    @Test
    fun process() {
        val beforeTime = System.currentTimeMillis()
        assertEquals(MaxSubstringWithoutRepeatedCharacter().process("prateekbhaiya"), "ekbhaiy")
        val totalTime = System.currentTimeMillis() - beforeTime
        println("time $totalTime")
        assertEquals(MaxSubstringWithoutRepeatedCharacter().process("aabcb"), "abc")
    }

    @Test
    fun process2() {
        val beforeTime = System.currentTimeMillis()
        assertEquals(MaxSubstringWithoutRepeatedCharacter().process("prateekbhaiya"), "ekbhaiy")
        val totalTime = System.currentTimeMillis() - beforeTime
        println("time $totalTime")
        assertEquals(MaxSubstringWithoutRepeatedCharacter().process2("aabcb"), "abc")
    }
}