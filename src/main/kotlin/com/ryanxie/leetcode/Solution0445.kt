package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use stack to reverse the elements in the list
 */
class Solution0445 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val stack1 = mutableListOf<Int>()
        val stack2 = mutableListOf<Int>()
        var cur1 = l1
        var cur2 = l2
        while (cur1 != null) {
            stack1.add(cur1.`val`)
            cur1 = cur1.next
        }
        while (cur2 != null) {
            stack2.add(cur2.`val`)
            cur2 = cur2.next
        }
        var carry = 0
        var head: ListNode? = null
        while (stack1.isNotEmpty() || stack2.isNotEmpty() || carry > 0) {
            val sum = (if (stack1.isNotEmpty()) stack1.removeAt(stack1.lastIndex) else 0) +
                    (if (stack2.isNotEmpty()) stack2.removeAt(stack2.lastIndex) else 0) + carry
            carry = sum / 10
            val node = ListNode(sum % 10)
            // insert node to the head of the list
            node.next = head
            // update head
            head = node
        }
        return head
    }
}