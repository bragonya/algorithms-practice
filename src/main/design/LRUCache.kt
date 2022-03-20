package main.design
//problem: https://leetcode.com/problems/lru-cache/
class Node(var value: Int, val key: Int) {

    var previous: Node? = null
    var next: Node? = null
}


class DoubleLinkedList {

    private var first: Node? = null
    private var last: Node? = null

    fun moveToLast(node: Node){
        if(node == last) return
        val temp = if(node == first){
            val newLast = first
            first = first!!.next
            first!!.previous = null

            newLast
        }else {
            node.previous!!.next = node.next
            node.next!!.previous = node.previous

            node
        }

        val temp2 = last
        temp!!.next = null
        temp2!!.next = temp
        temp.previous = temp2
        last = temp
    }

    fun pop(): Int {

        if(first != null) {
            val poppedValue = first!!.key
            first = first!!.next
            return poppedValue
        }

        return -1
    }

    fun push(value: Int, key: Int): Node {

        return if(first == null) {
            first = Node(value, key)
            last = first
            last!!
        }else {
            val temp = last!!
            last = Node(value, key)
            temp.next = last
            last!!.previous = temp
            last!!
        }
    }
}


class LRUCache(private val capacity: Int) {

    private val hashMap = hashMapOf<Int, Node>()
    private val list = DoubleLinkedList()

    fun get(key: Int): Int {
        hashMap[key]?.let { node ->
            list.moveToLast(node)
            return node.value
        }

        return -1
    }

    fun put(key: Int, value: Int) {

        if(hashMap[key] != null){
            hashMap[key]!!.value = value
            list.moveToLast(hashMap[key]!!)
        }else {
            if(hashMap.size < capacity) {
                hashMap[key] = list.push(value, key)
            } else {
                val poppedValue = list.pop()
                hashMap.remove(poppedValue)

                hashMap[key] = list.push(value, key)
            }
        }
    }

}