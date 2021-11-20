package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class PartitionInTwoSubsetsTest {

    @Test
    fun solution() {

        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,5,11,5))
        )

        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,5,11,5))
        )

        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(14,9,8,4,3,2))
        )

        assertEquals(false,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,2,5))
        )

        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,1))
        )



        assertEquals(false,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,2,3,5))
        )

    }

    @Test
    fun testSolutionWithK(){
        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(4,3,2,3,5,2,1), 4)
        )


        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,5,11,5), 2)
        )

        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,5,11,5), 2)
        )

        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(14,9,8,4,3,2), 2)
        )

        assertEquals(false,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,2,5), 2)
        )

        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,1), 2)
        )



        assertEquals(false,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,2,3,5), 2)
        )

    }

    @Test
    fun testSolutionWithKNotEquals(){
        assertEquals(false,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,2,2,2,2), 3)
        )
        assertEquals(false,
            PartitionInTwoSubsets().canPartition(intArrayOf(4,3,2,3,5,3), 4)
        )
    }
}