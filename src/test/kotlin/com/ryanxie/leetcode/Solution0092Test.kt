package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0092Test {
    private val solution = Solution0092()

    @Test
    fun test1() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        node1.next = node2
        val node3 = ListNode(3)
        node2.next = node3
        val node4 = ListNode(4)
        node3.next = node4
        val node5 = ListNode(5)
        node4.next = node5
        val newHead = solution.reverseBetween(node1,2,4)
        expectThat(newHead?.`val`).isEqualTo(1)
        expectThat(newHead?.next?.`val`).isEqualTo(4)
        expectThat(newHead?.next?.next?.`val`).isEqualTo(3)
        expectThat(newHead?.next?.next?.next?.`val`).isEqualTo(2)
        expectThat(newHead?.next?.next?.next?.next?.`val`).isEqualTo(5)
    }

}