package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class ReorderLogsTest {

    @Test
    fun reorderLogFiles() {

        assertArrayEquals(
            arrayOf("let3 art zero","let1 art zero can","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"),
            ReorderLogs().reorderLogFiles(
                arrayOf("dig1 8 1 5 1","let1 art zero can","dig2 3 6","let2 own kit dig","let3 art zero")
            )
        )
    }
}