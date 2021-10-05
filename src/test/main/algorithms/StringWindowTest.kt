package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class StringWindowTest {

    @Test
    fun testStringWindow(){
        assertEquals("llo", StringWindow().getSmallestStringWindow("hello_world", "lol"))
        assertEquals("lo_wo", StringWindow().getSmallestStringWindow("hello_world", "ool"))
        assertEquals("ello", StringWindow().getSmallestStringWindow("hello", "eol"))
        assertEquals("buzz", StringWindow().getSmallestStringWindow("buzjkkazfabuzz", "buzz"))
    }
}