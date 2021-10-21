package main.algorithms

class Pown {

    fun pow1(n: Double, x1: Int): Double {
        var result = 1.toDouble()
        repeat(x1) {
            result *= n
        }
        return result
    }

    fun pow2(n: Double, x1: Int): Double {
        val x = Math.abs(x1)
        if(x == 0) return 1.toDouble()
        if(n == 0.toDouble()) return 0.toDouble()

        var times = 1
        var minPow = x
        while(minPow % 2 == 0 && minPow > 2){
            times*=2
            minPow/= 2
        }

        var resultAtMinPow  = 1.toDouble()

        for(i in 1..minPow) {
            resultAtMinPow *= n
        }

        var result = resultAtMinPow
        for(i in 1 until times) {
            result *= resultAtMinPow
        }

        return if(x1 < 0 ) 1/result else result

    }

    fun pow3(n: Double, x1: Int): Double {
        fun backTracking(n: Double, x1: Int): Double{
            if(x1 == 0) return 1.toDouble()
            if(n == 0.toDouble()) return 0.toDouble()

            val result = backTracking(n, x1 / 2)
            return if(x1 % 2 == 0) result*result else result * result * n
        }

        return if(x1 < 0 ) 1/backTracking(n, Math.abs(x1)) else 1/backTracking(n, Math.abs(x1))
    }

}