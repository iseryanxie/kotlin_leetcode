package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0023 {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) return null
        if (lists.size == 1) return lists[0]
        val mid = lists.size / 2
        val left = mergeKLists(lists.copyOfRange(0, mid))
        val right = mergeKLists(lists.copyOfRange(mid, lists.size))
        return mergeTwoLists(left, right)
    }

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        if (l2 == null) return l1
        if (l1.`val` < l2.`val`) {
            l1.next = mergeTwoLists(l1.next, l2)
            return l1
        } else {
            l2.next = mergeTwoLists(l1, l2.next)
            return l2
        }
    }
}