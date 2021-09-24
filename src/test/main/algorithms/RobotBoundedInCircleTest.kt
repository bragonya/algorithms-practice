package main.algorithms

import org.junit.Assert.*
import org.junit.Test

class RobotBoundedInCircleTest {

    @Test
    fun testIsRobotBounded(){

        assertEquals(true, RobotBoundedInCircle().isRobotBoundedInCircle("GGLLGG"))
        assertEquals(true, RobotBoundedInCircle().isRobotBoundedInCircle("GL"))
    }
}