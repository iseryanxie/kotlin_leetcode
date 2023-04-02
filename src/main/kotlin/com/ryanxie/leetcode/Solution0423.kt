package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0423 {
    fun originalDigits(s: String): String {
        val count = IntArray(10)
        val charCount = IntArray(26)
        for (c in s) {
            charCount[c - 'a']++
        }
        // count how many z there are in this string, then we know how many 0 there are, because only 0 has z
        count[0] = charCount['z' - 'a']
        // similarly, we count 2s based on w
        count[2] = charCount['w' - 'a']
        count[4] = charCount['u' - 'a']
        count[6] = charCount['x' - 'a']
        count[8] = charCount['g' - 'a']
        // only 3 and 8 have h, so count of 3 is the difference between count of h and count of 8
        count[3] = charCount['h' - 'a'] - count[8]
        count[5] = charCount['f' - 'a'] - count[4]
        count[7] = charCount['s' - 'a'] - count[6]
        count[9] = charCount['i' - 'a'] - count[5] - count[6] - count[8]
        count[1] = charCount['n' - 'a'] - count[7] - 2 * count[9]
        val sb = StringBuilder()
        for (i in 0..9) {
            for (j in 0 until count[i]) {
                sb.append(i)
            }
        }
        return sb.toString()
    }
}