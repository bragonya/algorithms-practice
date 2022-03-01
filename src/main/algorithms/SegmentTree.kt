package main.algorithms

class SegmentTree(val arr :IntArray) {
    val segmentTreeL = IntArray(2*arr.size-1)
    init {
        fun helper(il:Int, ir:Int, nl: Int): Int{

            if(il == ir){
                segmentTreeL[nl] = arr[il]
                return arr[il]
            }

            val valI = helper(il, (ir+il)/2, 2*nl + 1)
            val valD = helper((ir+il)/2+1, ir, 2*nl + 2)
            val result = valI + valD
            segmentTreeL[nl] = result
            return result
        }

        helper(0, arr.lastIndex, 0)
    }

    fun solve(q: Array<IntRange>): IntArray{
        val result = mutableListOf<Int>()
        for(r in q) {
            result.add(find(0, arr.lastIndex, 0, r.first, r.last))
        }

        return result.toIntArray()
    }

    fun find(dl: Int, dr: Int, index: Int, value: Int) {
        find(0, segmentTreeL.lastIndex, 0, dl, dr)
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
        if(i == index && r == index) { //desired index
            segmentTreeL[nl] = value
            return value
        }

        if(i > index  && r > index || i < index && r < index) return segmentTreeL[nl] // no overlap

        val valI = update(i, (r+i)/2, index, value, 2*nl + 1)
        val valD = update((i+r)/2+1, r, index, value,2*nl + 2)
        val result = valI + valD
        segmentTreeL[nl] = result
        return result
    }
}