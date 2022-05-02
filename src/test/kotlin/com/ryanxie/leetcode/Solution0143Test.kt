package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0143Test{
    private val solution = Solution0143()

    @Test
    fun test1() {
        val listNode1 = ListNode(1)
        val listNode2 = ListNode(2)
        val listNode3 = ListNode(3)
        val listNode4 = ListNode(4)
        listNode1.next = listNode2
        listNode2.next = listNode3
        listNode3.next = listNode4
        solution.reorderList(listNode1)
        expectThat(listNode1.next).isEqualTo(listNode4)
        expectThat(listNode4.next).isEqualTo(listNode2)
        expectThat(listNode2.next).isEqualTo(listNode3)
    }

}