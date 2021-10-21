package main.benchmark

fun calculateTime(TAG: String = "Anonymous", function : () -> Unit){
    val startTime = System.nanoTime()
    function.invoke()
    println("time of $TAG ${System.nanoTime() - startTime}")
}