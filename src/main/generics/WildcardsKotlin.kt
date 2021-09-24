package main.generics

class WildcardsKotlin {
    fun <T> copy(
        val1: Shape<T>,
        val2: Shape<T>
    ) {

    }

    fun <T> verification(from: List<T>, to: MutableList<T>) {
        to.addAll(from)
    }
}

interface Shape<out T>{

    fun next(): T?

}

interface ShapeOut<out T>{

    fun get(): T?

}

interface ShapeIn<in T>{

    fun toString(value: T)

}

class ShapeImpl <T> (val value: T): Shape<T> {

    var next: T? = null

    companion object{
        fun <T> createShapeOf(value: T): Shape<T> {
            return ShapeImpl(value)
        }
    }

    override fun next(): T? = next()
}

open class MasterShape

class Rectangle: MasterShape()
//class Circle: main.generics.Shape

fun main2() {
    Wildcards().copy<Number>(listOf(1,2,3,4), mutableListOf<Number>(1,1))
    WildcardsKotlin().copy<MasterShape>(
        ShapeImpl.createShapeOf<Rectangle>(
            Rectangle()
        ),
        ShapeImpl.createShapeOf<Rectangle>(
            Rectangle()
        )
    )

    val array:List<String> = listOf("hola")
    array.contains("hola")

    Wildcards().verification(listOf<List<String>>(), mutableListOf<Any>())
    WildcardsKotlin().verification(listOf("Ana"), mutableListOf<Any>())



}

fun testParametizedInterfaces(shapeIn: ShapeIn<Any>, shapeOut: ShapeOut<String>){
    val testEntry: ShapeIn<String> = shapeIn
    val testEntry2: ShapeOut<Any> = shapeOut
}