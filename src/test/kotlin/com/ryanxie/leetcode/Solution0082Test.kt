package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0082Test {
    private val solution = Solution0082()

    @Test
    fun test1() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        node1.next = node2
        val node3 = ListNode(3)
        node2.next = node3
        val node3_2 = ListNode(3)
        node3.next = node3_2
        val node4 = ListNode(4)
        node3_2.next = node4
        val node4_2 = ListNode(4)
        node4.next = node4_2
        val node5 = ListNode(5)
        node4_2.next = node5
        val newHead = solution.deleteDuplicates(node1)
        expectThat(newHead?.`val`).isEqualTo(1)
        expectThat(newHead?.next?.`val`).isEqualTo(2)
        expectThat(newHead?.next?.next?.`val`).isEqualTo(5)
        expectThat(newHead?.next?.next?.next).isEqualTo(null)
    }

    @Test
    fun test2() {
        val node1 = ListNode(1)
        val node2 = ListNode(1)
        node1.next = node2
        val node3 = ListNode(3)
        node2.next = node3
        val node3_2 = ListNode(3)
        node3.next = node3_2
        val node4 = ListNode(4)
        node3_2.next = node4
        val node4_2 = ListNode(4)
        node4.next = node4_2
        val node5 = ListNode(5)
        node4_2.next = node5
        val newHead = solution.deleteDuplicates(node1)
        expectThat(newHead?.`val`).isEqualTo(5)
        expectThat(newHead?.next).isEqualTo(null)
    }
}