package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0437Test{
    private val solution = Solution0437()

    @Test
    fun test1(){
        val actual = solution.pathSum(
                TreeNode(10,
                        TreeNode(5,
                                TreeNode(3,
                                        TreeNode(3),
                                        TreeNode(-2)),
                                TreeNode(2,
                                        null,
                                        TreeNode(1))),
                        TreeNode(-3,
                                null,
                                TreeNode(11))),
                8)
        Assert.assertEquals(3, actual)
    }

    @Test
    fun `test case that overflow integer` () {
        // [1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000]
        val actual = solution.pathSum(
                TreeNode(1000000000,
                        TreeNode(1000000000,
                                TreeNode(294967296,
                                    TreeNode(1000000000,
                                        TreeNode(1000000000,
                                            TreeNode(1000000000),
                                            null),
                                        null),
                                    null),
                                null),
                        null),
                0)
        Assert.assertEquals(0, actual)
    }
}