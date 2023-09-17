package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0147Test {
    private val solution = Solution0147()

    @Test
    fun test1() {
        val actual = solution.insertionSortList(ListNode(4, ListNode(2, ListNode(1, ListNode(3)))))
        val expected = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
        Assert.assertEquals(expected.`val`, actual?.`val`)
        Assert.assertEquals(expected.next?.`val`, actual?.next?.`val`)
        Assert.assertEquals(expected.next?.next?.`val`, actual?.next?.next?.`val`)
        Assert.assertEquals(expected.next?.next?.next?.`val`, actual?.next?.next?.next?.`val`)
    }
}