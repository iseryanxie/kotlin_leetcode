package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0021Test{
    private val solution = Solution0021()

    @Test
    fun test1(){
        val node14 = ListNode(4)
        val node12 = ListNode(2)
        node12.next = node14
        val node11 = ListNode(1)
        node11.next = node12
        val node24 = ListNode(4)
        val node23 = ListNode(3)
        node23.next = node24
        val node21 = ListNode(1)
        node21.next = node23
        val actual = solution.mergeTwoLists(node11, node21)
        Assert.assertEquals(1, actual?.`val`)
        Assert.assertEquals(1, actual?.next?.`val`)
        Assert.assertEquals(2, actual?.next?.next?.`val`)
        Assert.assertEquals(3, actual?.next?.next?.next?.`val`)
        Assert.assertEquals(4, actual?.next?.next?.next?.next?.`val`)
        Assert.assertEquals(4, actual?.next?.next?.next?.next?.next?.`val`)
        Assert.assertEquals(null, actual?.next?.next?.next?.next?.next?.next)
    }
}