package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0693 {
    fun hasAlternatingBits(n: Int): Boolean {
        var n = n
        var prev = n % 2
        n /= 2
        while (n > 0) {
            val cur = n % 2
            if (cur == prev) {
                return false
            }
            prev = cur
            n /= 2
        }
        return true
    }
}