package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0147 {
    fun insertionSortList(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }
        val dummy = ListNode(0)
        var cur = head
        while (cur != null) {
            val next = cur.next
            // always search from the beginning of the list
            var pre = dummy
            while (pre.next != null && pre.next!!.`val` < cur.`val`) {
                // search for the position to insert because the list is singly linked list
                pre = pre.next!!
            }
            // insert cur between pre and pre.next
            cur.next = pre.next
            pre.next = cur
            // move cur to next
            cur = next
        }
        return dummy.next

    }
}