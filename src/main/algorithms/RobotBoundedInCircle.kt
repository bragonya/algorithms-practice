package main.algorithms

class RobotBoundedInCircle {

    fun isRobotBoundedInCircle(coordinates: String): Boolean {
        val coordinateSystem = CoordinateSystem()

        repeat(4){
            if(tryToGetOrigin(coordinates, coordinateSystem)) return true
        }

        return false
    }

    fun tryToGetOrigin(coordinates: String, coordinateSystem: CoordinateSystem): Boolean{
        coordinates.forEach {
            coordinateSystem.updateCoordinateSystem(it)
        }

        return coordinateSystem.validateSystemIsBounded()
    }


    data class CoordinateSystem(private var x: Int =0, private var y:Int = 0, private var coordinate: Int = -90){

        fun updateCoordinateSystem(letter: Char) {
            if(letter == 'G'){
                val (x, y ) = calculateOrientation()
                this.x += x
                this.y += y
            }else{
                calculateAngle(letter)
            }
        }

        fun validateSystemIsBounded() = this.x == 0 && this.y == 0

        private fun calculateOrientation(): Pair<Int, Int> {
            return when(coordinate) {
                0, 360, -360 -> 1 to 0
                90, -270 -> 0 to -1
                180, -180 -> -1 to 0
                270, -90 -> 0 to 1
                else -> throw Exception("Invalid coordinate")
            }
        }

        private fun calculateAngle(letter: Char): Int{
            val newCoordinate = mappingLetterToNumber(letter)

            coordinate = (coordinate + newCoordinate) % 360
            return coordinate
        }

        private fun mappingLetterToNumber(letter: Char): Int = when(letter) {
                'L' -> -90
                'R' -> 90
                else -> throw Exception("No valid coordinate")
            }
    }
}