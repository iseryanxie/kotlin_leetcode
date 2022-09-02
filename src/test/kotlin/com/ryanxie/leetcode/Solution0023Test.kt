package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Solution0023Test{
    private val solution = Solution0023()

    @Test
    fun test1(){
        val input: Array<ListNode?> = arrayOf(
            ListNode(1).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            },
            ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            },
            ListNode(2).apply {
                next = ListNode(6)
            }
        )
        val expected = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(4).apply {
                                next = ListNode(5).apply {
                                    next = ListNode(6)
                                }
                            }
                        }
                    }
                }
            }
        }
        val actual = solution.mergeKLists(input)
        expectThat(actual?.`val`).isEqualTo(expected.`val`)
        expectThat(actual?.next?.`val`).isEqualTo(expected.next?.`val`)
        expectThat(actual?.next?.next?.`val`).isEqualTo(expected.next?.next?.`val`)
        expectThat(actual?.next?.next?.next?.`val`).isEqualTo(expected.next?.next?.next?.`val`)
        expectThat(actual?.next?.next?.next?.next?.`val`).isEqualTo(expected.next?.next?.next?.next?.`val`)
        expectThat(actual?.next?.next?.next?.next?.next?.`val`).isEqualTo(expected.next?.next?.next?.next?.next?.`val`)
        expectThat(actual?.next?.next?.next?.next?.next?.next?.`val`).isEqualTo(expected.next?.next?.next?.next?.next?.next?.`val`)
        expectThat(actual?.next?.next?.next?.next?.next?.next?.next?.`val`).isEqualTo(expected.next?.next?.next?.next?.next?.next?.next?.`val`)
    }
}