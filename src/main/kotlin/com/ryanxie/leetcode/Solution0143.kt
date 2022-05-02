package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * 1. split the list in half: 1,2 and 3,4
 * 2. reverse the second half: 1,2 and 4,3
 * 3. interweave merge the two lists: 1,4,2,3
 */
class Solution0143 {
    fun reorderList(head: ListNode?): Unit {
        if (head == null || head.next == null) return
        var slow = head
        var fast = head
        while (fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        var second = slow?.next
        slow?.next = null
        // reverse second list
        var prev: ListNode? = null
        while (second != null) {
            val next = second.next
            second.next = prev
            prev = second
            second = next
        }
        // merge two lists
        var first = head
        second = prev
        while (second != null) {
            val next = first?.next
            val next2 = second?.next
            first?.next = second
            second?.next = next
            first = next
            second = next2
        }
    }
}