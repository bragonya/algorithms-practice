package main.algorithms

class NextClosestTime {

    fun solveNextClosestTime(time:String):String{
        val time = time.replace(":", "")
        val digits = setOf(time[0],time[1],time[2],time[3])
        var min = Long.MAX_VALUE
        var minString =time

        val currentTime = generateHHMMToMinutes(time)

        fun innerFunction(time:String, index:Int){
            if(index<0) return
            if(invalidDate(time)) return
            val nodeTime = generateHHMMToMinutes(time)
            if (currentTime != nodeTime){
                val value = nodeTime-currentTime
                val realDistance = if (value<0) 24*60 + value else value
                if (realDistance<min){
                    min= realDistance
                    minString = time
                }
            }
            digits.forEach { digit ->
                innerFunction(time.replaceRange(index..index, digit.toString()), index-1)
            }
        }

        innerFunction(time,3)
        return minString.substring(0,2) + ":" + minString.substring(2,4)
    }

    private fun invalidDate(time: String) = "${time[0]}${time[1]}".toInt() > 23 || "${time[2]}${time[3]}".toInt() >59

    private fun generateHHMMToMinutes(time:String) = "${time[0]}${time[1]}".toLong()*60 + "${time[2]}${time[3]}".toLong()
}


