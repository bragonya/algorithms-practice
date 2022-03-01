package main.adventofcode

import org.junit.Test
import java.io.File

class BinaryDiagnosticTest {

    @Test
    fun testFromFile(){

        val file = File("./src/assets/BinaryDay3AdventOfCode.txt")
        val input = mutableListOf<String>()
        file.forEachLine {  lines ->
            input.add(lines)
        }
        println(BinaryDiagnostic().solve(input))
    }

    @Test
    fun testEasyFromFile(){

        val file = File("./src/assets/BinaryDay3Easy.txt")
        val input = mutableListOf<String>()
        file.forEachLine {  lines ->
            input.add(lines)
        }
        println(BinaryDiagnostic().solve(input))
    }
}