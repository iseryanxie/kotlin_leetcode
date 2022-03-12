package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0521 {
    fun findLUSlength(a: String, b: String): Int {
        return if (a == b) -1 else maxOf(a.length, b.length)
    }
}