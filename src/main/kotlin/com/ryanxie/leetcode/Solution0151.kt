package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * 1. split by " "
 * 2. reverse and filter empty string
 * 3. join by " "
 */
class Solution0151 {
    fun reverseWords(s: String): String {
        val words = s.split(" ")
        val reversed = words.reversed().filter { it.isNotEmpty() }
        return reversed.joinToString(" ")
    }
}