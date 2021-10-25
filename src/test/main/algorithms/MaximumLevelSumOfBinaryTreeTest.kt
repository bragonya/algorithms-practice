package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class MaximumLevelSumOfBinaryTreeTest {

    @Test
    fun maxLevelSum() {

        assertEquals(
            1,
            MaximumLevelSumOfBinaryTree().maxLevelSum(
                TreeNode(1).apply {
                    left = TreeNode(1).apply {
                        left = TreeNode(7)
                        right = TreeNode(-8)
                    }
                    right = TreeNode(0).apply {
                        left = TreeNode(7)
                        right = TreeNode(-9)
                    }
                }
            )
        )

        assertEquals(
            2,
            MaximumLevelSumOfBinaryTree().maxLevelSum(
                TreeNode(1).apply {
                    left = TreeNode(7).apply {
                        left = TreeNode(7)
                        right = TreeNode(-8)
                    }
                    right = TreeNode(0)
                }
            )
        )
    }
}