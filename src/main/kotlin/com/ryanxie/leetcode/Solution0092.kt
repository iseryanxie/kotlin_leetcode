package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0092 {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        val dummy:ListNode? = ListNode(0)
        dummy!!.next = head
        // reach node at position left
        var leftPrev = dummy
        var current = dummy!!.next
        for (i in 0 until left - 1) {
            leftPrev = current
            current = current!!.next
        }

        // now current = left, leftPrev = "node before left"
        // reverse from left to right
        var prev:ListNode? = null
        for (i in 0 until right - left + 1) {
            val next = current!!.next
            current.next = prev
            prev = current
            current = next
        }

        // connect leftPrev and prev
        leftPrev!!.next!!.next = current
        leftPrev.next = prev
        return dummy.next
    }
}