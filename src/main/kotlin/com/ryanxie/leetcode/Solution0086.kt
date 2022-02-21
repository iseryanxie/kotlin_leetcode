package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use two pointers
 */
class Solution0086 {
    fun partition(head: ListNode?, x: Int): ListNode? {
        head ?: return null
        var left = ListNode(0)
        var right = ListNode(0)
        var p = head
        val dummyLeft = left
        val dummyRight = right
        while (p != null) {
            if (p.`val` < x) {
                left.next = p
                left = left.next!!
            } else {
                right.next = p
                right = right.next!!
            }
            p = p.next
        }
        left.next = dummyRight.next
        right.next = null
        return dummyLeft.next
    }
}