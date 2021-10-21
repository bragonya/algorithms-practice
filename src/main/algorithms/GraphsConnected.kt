package main.algorithms

class GraphsConnected {

    fun getNumberOfConnections(connections: Array<IntArray>): Int {

        val hashMap = hashMapOf<Int, Int>() // nodeValue vs graphId
        var lastGraphIdAssigned = 0
        var numberOfGraphs = 0

        for(nodeValue in connections) {
            val node1 = nodeValue[0]
            val node2 = nodeValue[1]

            val graphIdNode1 = hashMap[node1]
            val graphIdNode2 = hashMap[node2]
            if(graphIdNode1!=null && graphIdNode2!=null) {
                if(graphIdNode1 != graphIdNode2) {
                    numberOfGraphs--
                    for(i in 0 until hashMap.size) {
                        if(hashMap[i] == graphIdNode2)
                            hashMap[i] = graphIdNode1
                    }
                }
            }
            else if(graphIdNode1 != null) {
                hashMap.put(node2, graphIdNode1)
            }else if(graphIdNode2 != null) {
                hashMap.put(node1, graphIdNode2)
            }else {
                hashMap.put(node1, lastGraphIdAssigned)
                hashMap.put(node2, lastGraphIdAssigned)
                lastGraphIdAssigned++
                numberOfGraphs++
            }
        }
        return numberOfGraphs
    }
}