package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class PartitionInTwoSubsetsTest {

    @Test
    fun solution() {

        assertEquals(false,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,2,5))
        )

        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,1))
        )

        assertEquals(true,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,5,11,5))
            )

        assertEquals(false,
            PartitionInTwoSubsets().canPartition(intArrayOf(1,2,3,5))
        )

    }
}