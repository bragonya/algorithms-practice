package main.algorithms

class SmallestCount {
    fun countSmaller(nums: IntArray): List<Int> {
        val output = mutableListOf<Int>()
        val offset = 10000
        val size = 2 * 10000 + 1
        val segmentTree = SegmentTreeSmallest(IntArray(size, {0}))

        for(n in nums.reversed()){
            val result = segmentTree.find(0, n+offset-1)
            println("result for n $n is $result")
            output.add(result)
            //segmentTree.update(n+offset, 1)
        }
        return output.reversed()
    }
}

class SegmentTreeSmallest(val arr :IntArray) {
    val segmentTreeL = IntArray(2*arr.size-1)


    fun find(dl: Int, dr: Int): Int {
        return find(0, segmentTreeL.lastIndex, 0, dl, dr)
    }

    private fun find(il: Int, ir:Int, nl:Int, dl:Int, dr: Int): Int{
        if(il < dl && ir < dl || il >dr && ir > dr) return 0 // there is no overlap

        if(il == dl && ir <= dr || ir == dr && il >= dl || ir == il){
            return segmentTreeL[nl]
        }

        val valI = find(il, (ir+il)/2, 2*nl + 1, dl, dr)
        val valD = find((ir+il)/2+1, ir, 2*nl + 2, dl, dr)

        return valI + valD
    }

    fun update(index: Int, value: Int) {
        update(0, arr.lastIndex, index, value, 0)
    }

    private fun update(i: Int, r: Int, index: Int, value: Int, nl: Int): Int {



        if(i > index  && r > index || i < index && r < index) return segmentTreeL[nl] // no overlap
        println("i $i r $r nl $nl")
        if(i == index && r == index) { //desired index
            segmentTreeL[nl] += value
            return segmentTreeL[nl]
        }
        val valI = update(i, (r+i)/2, index, value, 2*nl + 1)
        val valD = update((i+r)/2+1, r, index, value,2*nl + 2)
        val result = valI + valD
        segmentTreeL[nl] = result
        return result
    }
}