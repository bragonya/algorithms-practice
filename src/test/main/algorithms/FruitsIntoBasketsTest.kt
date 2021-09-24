import main.algorithms.FruitsIntoBaskets
import main.algorithms.RoomMeetingII
import org.junit.Test
import kotlin.test.assertEquals

class FruitsIntoBasketsTest {

    @Test
    fun testFruitsIntoBaskets(){
        assertEquals(
                FruitsIntoBaskets().maxNumberOfTwoFruits(
                        intArrayOf(8, 9, 6, 6, 9, 1, 1, 1, 3, 3, 2, 1),
                        k = 2
                ), 5
        )
        assertEquals(
                FruitsIntoBaskets().maxNumberOfTwoFruits(
                        intArrayOf(8, 9, 6, 6, 9, 1, 1, 1, 3, 3, 2, 1, 1, 1, 1, 1),
                        k = 2
                ), 6
        )
        assertEquals(
                FruitsIntoBaskets().maxNumberOfTwoFruits(
                        intArrayOf(8, 9, 6, 6, 9, 1, 1, 1, 3, 3, 2, 1, 1, 1, 1, 1),
                        k = 3
                ), 11
        )
    }
}