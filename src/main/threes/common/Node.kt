package main.threes.common

data class Node (
    val value: Int,
    var left: Node? = null,
    var right: Node? = null
)