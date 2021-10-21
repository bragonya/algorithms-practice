package main.algorithms

class NumberOfProvinces {

    fun findCircleNum(connections: Array<IntArray>): Int {
        // nxn matrix, find provinces connected

        val graphMap = HashMap<Int, Int>() // ProvinceId vs AreaId
        var assignableAreaId = 0
        var numberOfProvinces = 0

        for (i in connections.indices) {
            val currentVertex = connections[i]
            val currentArea = graphMap[i] ?: assignableAreaId++.also { numberOfProvinces++ }

            for (j in currentVertex.indices) {
                val currentConnection = currentVertex[j]
                if (currentConnection == 0 || i == j) continue
                val connectionArea = graphMap[j]
                if (connectionArea == null) {
                    graphMap[j] = currentArea
                }else if(connectionArea != currentArea) {
                    numberOfProvinces--
                    for (k in graphMap.keys) {
                        if(graphMap[k] == connectionArea) graphMap[k] = currentArea
                    }
                }
            }
        }

        return numberOfProvinces
    }
}