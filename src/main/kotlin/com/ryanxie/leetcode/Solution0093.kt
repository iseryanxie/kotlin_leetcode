package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * use backtracking
 */
class Solution0093 {
    fun backtrack(p: Int, numDots: Int, s: String, res: MutableList<String>, curIP: String) {
        val n = s.length
        if (numDots == 4 && p == n) {
            // remove last dot
            res.add(curIP.substring(0, curIP.length - 1))
            return
        }
        if (numDots > 4) return
        // skip more than 3 digits
        for (i in p until minOf(n, p + 3)) {
            // first letter must be nonzero unless it's the only letter
            if (i > p && s[p] == '0') continue
            val cur = s.substring(p, i + 1)
            if (cur.toInt() > 255) continue
            backtrack(i + 1, numDots + 1, s, res, curIP + s.substring(p, i + 1) + ".")
        }
    }

    fun restoreIpAddresses(s: String): List<String> {
        val result = mutableListOf<String>()
        if (s.length < 4 || s.length > 12) return result
        backtrack(0, 0, s, result, "")
        return result
    }
}