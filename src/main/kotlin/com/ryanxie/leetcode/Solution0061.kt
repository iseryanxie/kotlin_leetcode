package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * 1. enumerate the list to find N and the origTail
 * 2. Find the new tail after rotate, which is the N-k%N th node
 * 3. Save the new head, which is newTail.next
 * 4. newTail.next -> null
 * 5. origTail.next -> origHead
 * 6. return newHead
 */
class Solution0061 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        head?: return head
        var N = 1
        var origTail: ListNode? = head
        var origHead: ListNode? = head
        while (origTail?.next != null) {
            N++
            origTail = origTail.next
        }
        val newTailIndex = N - k % N
        if (newTailIndex == N) {
            return head
        }
        var newTail = head
        for (i in 1 until newTailIndex) {
            newTail = newTail?.next
        }
        val newHead = newTail?.next
        newTail?.next = null
        origTail?.next = origHead
        return newHead
    }
}