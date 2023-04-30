package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0443 {
    fun compress(chars: CharArray): Int {
        var i = 0
        var j = 0
        while (j < chars.size) {
            val c = chars[j]
            var count = 0
            while (j < chars.size && chars[j] == c) {
                j++
                count++
            }
            chars[i++] = c
            if (count > 1) {
                for (digit in count.toString()) {
                    chars[i++] = digit
                }
            }
        }
        return i
    }
}