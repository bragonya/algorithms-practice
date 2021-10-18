package main.andelachallenge

import org.junit.Assert.*
import org.junit.Test

class CoursesPrerequisitesTest {

    @Test
    fun testSolution() {

        assertArrayEquals(
            arrayOf(
                "Software Design",
                "Computer Networks",
                "Computer Architecture",
                "Data Structures",
                "Algorithms",
                "Foundations of Computer Science",
                "Operating Systems"
            ),
            CoursesPrerequisites().solution(
                arrayOf(
                    arrayOf("Foundations of Computer Science", "Operating Systems"),
                    arrayOf("Data Structures", "Algorithms"),
                    arrayOf("Computer Networks", "Computer Architecture"),
                    arrayOf("Algorithms", "Foundations of Computer Science"),
                    arrayOf("Computer Architecture", "Data Structures"),
                    arrayOf("Software Design", "Computer Networks")
                )
            )
        )
    }

    @Test
    fun testSolutionTopological() {

        assertArrayEquals(
            arrayOf(
                "Software Design",
                "Computer Networks",
                "Computer Architecture",
                "Data Structures",
                "Algorithms",
                "Foundations of Computer Science",
                "Operating Systems"
            ),
            CoursesPrerequisites().solutionTopologicalSort(
                arrayOf(
                    arrayOf("Foundations of Computer Science", "Operating Systems"),
                    arrayOf("Data Structures", "Algorithms"),
                    arrayOf("Computer Networks", "Computer Architecture"),
                    arrayOf("Algorithms", "Foundations of Computer Science"),
                    arrayOf("Computer Architecture", "Data Structures"),
                    arrayOf("Software Design", "Computer Networks")
                )
            )
        )
    }
}