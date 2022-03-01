package main.algorithms

import org.junit.Test
import kotlin.test.assertEquals

class RoomMeetingIITest{

    @Test
    fun testRoomMeetingII(){
        assertEquals(
            RoomMeetingII().numberOfRoomMeetingNeeded(
                arrayListOf(
                    RoomMeetingII.Interval(0, 30),
                    RoomMeetingII.Interval(5, 10),
                    RoomMeetingII.Interval(15, 20)
                )
            ),
            2
        )
    }

    @Test
    fun testRoomMeetingSolution2(){
        assertEquals(
            RoomMeetingII().numberOfRoomMeetingNeeded2(
                arrayListOf(
                    RoomMeetingII.Interval(0, 30),
                    RoomMeetingII.Interval(5, 10),
                    RoomMeetingII.Interval(15, 20)
                )
            ),
            2
        )

        assertEquals(
            RoomMeetingII().numberOfRoomMeetingNeeded2(
                arrayListOf(
                    RoomMeetingII.Interval(13, 15),
                    RoomMeetingII.Interval(1, 13),
                )
            ),
            1
        )
    }


    @Test
    fun testSeveralQueries(){
        assertEquals(
            listOf(false, true),
            RoomMeetingII().querySeveralEvents(
                arrayListOf(
                    RoomMeetingII.Interval(1,2),
                    RoomMeetingII.Interval(4,5),
                    RoomMeetingII.Interval(8,10)
                ),
                arrayListOf(
                    RoomMeetingII.Interval(4,5),
                    RoomMeetingII.Interval(5,6)
                ),
                1
            )
        )
    }
}