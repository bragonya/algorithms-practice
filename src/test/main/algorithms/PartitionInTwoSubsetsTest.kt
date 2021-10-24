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
}