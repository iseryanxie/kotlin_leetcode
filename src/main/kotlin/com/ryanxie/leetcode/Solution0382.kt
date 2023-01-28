package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * reservoir sampling
 * at first step, we have 1/1 chance to pick head
 * at second step, we have 1/2 chance to pick first 1/2 chance to pick second
 * and so on
 */
class Solution0382(private val head: ListNode?) {
    fun getRandom(): Int {
        var node = head
        var result = 0
        var count = 0
        while (node != null) {
            if (Math.random() < 1.0 / ++count) {
                result = node.`val`
            }
            node = node.next
        }
        return result
    }
}