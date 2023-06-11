package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0696 {
    fun countBinarySubstrings(s: String): Int {
        // prev is the number of consecutive 1s or 0s before the current number
        var prev = 0
        // curr is the number of consecutive 1s or 0s in current position
        var curr = 1
        // res is the number of valid substrings
        var res = 0
        for (i in 1 until s.length) {
            if (s[i] == s[i - 1]) {
                // when it matches, increment the curr
                curr++
            } else {
                // when not match, update the prev and reset the curr
                prev = curr
                curr = 1
            }
            // if prev >= curr, you can always select curr number before and after to form a valid substring
            if (prev >= curr) {
                res++
            }
        }
        return res
    }
}