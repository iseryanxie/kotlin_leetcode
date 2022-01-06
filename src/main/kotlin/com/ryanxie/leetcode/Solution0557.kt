package com.ryanxie.leetcode
/**
 * Write your thoughts here
 *
 */

class Solution0557 {
    fun reverseWords(s: String): String {
        return s.split(" ").map {
            it.reversed()
        }.joinToString(" ")
    }
}
