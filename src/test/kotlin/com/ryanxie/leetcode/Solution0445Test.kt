package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0445Test{
    private val solution = Solution0445()

    @Test
    fun test1(){
        val actual = solution.addTwoNumbers(
            ListNode(7).apply {
                next = ListNode(2).apply {
                    next = ListNode(4).apply {
                        next = ListNode(3)
                    }
                }
            },
            ListNode(5).apply {
                next = ListNode(6).apply {
                    next = ListNode(4)
                }
            }
        )
        val expected = ListNode(7).apply {
            next = ListNode(8).apply {
                next = ListNode(0).apply {
                    next = ListNode(7)
                }
            }
        }
        Assert.assertEquals(expected.`val`, actual?.`val`)
        Assert.assertEquals(expected.next?.`val`, actual?.next?.`val`)
        Assert.assertEquals(expected.next?.next?.`val`, actual?.next?.next?.`val`)
        Assert.assertEquals(expected.next?.next?.next?.`val`, actual?.next?.next?.next?.`val`)
    }
}