package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0328Test{
    private val solution = Solution0328()

    @Test
    fun test1(){
        val actual = solution.oddEvenList(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))))
        val expected = ListNode(1, ListNode(3, ListNode(5, ListNode(2, ListNode(4)))))
        expectThat(actual?.`val`).isEqualTo(expected.`val`)
        expectThat(actual?.next?.`val`).isEqualTo(expected.next?.`val`)
        expectThat(actual?.next?.next?.`val`).isEqualTo(expected.next?.next?.`val`)
        expectThat(actual?.next?.next?.next?.`val`).isEqualTo(expected.next?.next?.next?.`val`)
        expectThat(actual?.next?.next?.next?.next?.`val`).isEqualTo(expected.next?.next?.next?.next?.`val`)
    }
}