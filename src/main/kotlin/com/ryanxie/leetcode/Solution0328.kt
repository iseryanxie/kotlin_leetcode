package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0328 {
    fun oddEvenList(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }
        var odd = head // odd pointer collects all the nodes start with odd index
        var even = head.next
        var evenHead = even // even head is to store the head of the even list
        while (even?.next != null) {
            odd!!.next = even.next // odd's next points to next odd, which is even's next
            odd = odd.next // odd pointer moves to the next odd
            even.next = odd!!.next // even's next points to next even, which is odd's next
            even = even.next // move even to next even
        }
        odd!!.next = evenHead // link odd's next to even's head
        return head
    }
}