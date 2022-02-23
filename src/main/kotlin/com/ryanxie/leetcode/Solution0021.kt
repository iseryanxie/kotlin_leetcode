package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution0021 {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var dummyHead:ListNode? = ListNode(0)
        var dummyNode = dummyHead
        var node1 = l1
        var node2 = l2
        while (node1 != null || node2 != null){
            if (node1 != null && node2 != null){
                if (node1.`val` <= node2.`val`){
                    dummyNode?.next = node1
                    node1 = node1.next
                }else{
                    dummyNode?.next = node2
                    node2 = node2.next
                }
            } else if (node1 != null){
                dummyNode?.next = node1
                node1 = node1?.next
            } else if (node2 != null){
                dummyNode?.next = node2
                node2 = node2?.next
            }
            dummyNode = dummyNode?.next
        }
        return dummyHead?.next
    }
}