package main.algorithms

import java.util.*
import kotlin.collections.ArrayList

//problem: https://leetcode.com/problems/meeting-rooms-ii/
class RoomMeetingII {


    fun numberOfRoomMeetingNeeded(intervals: ArrayList<Interval>) : Int {
        intervals.sortBy { it.start }
        val intervalsSortedByEarlier = PriorityQueue<Interval>(compareBy { it.end })
        intervalsSortedByEarlier.add(intervals.removeAt(0))

        for (currentInterval in intervals) {
            val earlierMeeting = intervalsSortedByEarlier.remove()
            if(currentInterval.start >= earlierMeeting.end){
                earlierMeeting.end = currentInterval.end
            }else {
                intervalsSortedByEarlier.add(currentInterval)
            }
            intervalsSortedByEarlier.add(earlierMeeting)
        }

        return intervalsSortedByEarlier.size
    }

    fun numberOfRoomMeetingNeeded2(intervals: ArrayList<Interval>) : Int {

        val flattenList = intervals.flatMap {
            listOf(it.start.toDouble() to false, it.end -0.01 to true)
        }
            .sortedBy { (point, _) -> point }

        var roomsNeeded = 0
        var max = 0
        for ((_, isEnd) in flattenList){
            if(!isEnd){ // is start
                roomsNeeded++
            }else{
                roomsNeeded--
            }
            max = max.coerceAtLeast(roomsNeeded)
        }
        return max
    }

    fun querySeveralEvents(calendar: ArrayList<Interval>, events: ArrayList<Interval>, rooms: Int): List<Boolean>{

        val outputList = events.map {
            calendar.add(it)
            val result = numberOfRoomMeetingNeeded2(calendar)
            calendar.remove(it)
            result <= rooms
        }

        return outputList
    }

    fun isThereAnyOverlap(intervals: MutableList<Interval>): Boolean {
        intervals.sortedBy { it.start }
        val queue = PriorityQueue<Interval>()
        queue.add(intervals.removeAt(0))
        for(interval in intervals){
            val currentEvent = queue.remove()
            if(interval.start >= currentEvent.end){
                currentEvent.end = interval.end
                queue.add(currentEvent)
            }else{
                return false
            }
        }
        return true
    }

    data class Interval (
        var start:Int,
        var end: Int
    )
}