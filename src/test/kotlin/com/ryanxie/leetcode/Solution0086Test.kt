package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0086Test {
    private val solution = Solution0086()

    @Test
    fun test1() {
        val node1 = ListNode(1)
        val node4 = ListNode(4)
        val node3 = ListNode(3)
        val node2 = ListNode(2)
        val node5 = ListNode(5)
        val node22 = ListNode(2)
        node1.next = node4
        node4.next = node3
        node3.next = node2
        node2.next = node5
        node5.next = node22
        val node = solution.partition(node1, 3)
        expectThat(node!!.`val`).isEqualTo(1)
        expectThat(node.next!!.`val`).isEqualTo(2)
        expectThat(node.next!!.next!!.`val`).isEqualTo(2)
        expectThat(node.next!!.next!!.next!!.`val`).isEqualTo(4)
        expectThat(node.next!!.next!!.next!!.next!!.`val`).isEqualTo(3)
        expectThat(node.next!!.next!!.next!!.next!!.next!!.`val`).isEqualTo(5)
    }
}