package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0082 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        // use dummy node
        var dummy = ListNode(0)
        dummy.next = head
        var pre = dummy
        var cur = head
        while (cur != null) {
            while (cur?.next != null && cur.`val` == cur.next!!.`val`) {
                cur = cur.next
            }
            if (pre.next == cur) {
                pre = pre.next!!
            } else {
                pre.next = cur?.next
            }
            cur = cur?.next
        }
        return dummy.next
    }
}