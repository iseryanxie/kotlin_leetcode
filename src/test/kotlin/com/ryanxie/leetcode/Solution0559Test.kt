package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0559Test{
    private val solution = Solution0559()

    @Test
    fun test1(){
        val node1 = Solution0559.Node(1)
        val node2 = Solution0559.Node(2)
        val node3 = Solution0559.Node(3)
        val node4 = Solution0559.Node(4)
        val node5 = Solution0559.Node(5)
        val node6 = Solution0559.Node(6)
        node1.children = listOf(node2, node3, node4)
        node3.children = listOf(node5, node6)
        Assert.assertEquals(3, solution.maxDepth(node1))
    }
}