package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 */
class Solution0522 {
    fun findLUSlength(strs: Array<String>): Int {
        // sort by length and then by lexicographical order
        Arrays.sort(strs) { s1, s2 ->
            if (s1.length == s2.length) {
                s1.compareTo(s2)
            } else {
                s1.length - s2.length
            }
        }
        var maxSize = -1
        var i = strs.size - 1
        // from longest to shortest
        while (i >= 0) {
            maxSize = strs[i].length
            while (i >= 1 && strs[i] == strs[i - 1]) {
                // if there are duplicates, skip
                i--
                maxSize = -1
            }
            if (maxSize > 0) {
                for (j in i + 1 until strs.size) {
                    // if current string is a subsequence of all longer strings, skip
                    if (isSubsequence(strs[i], strs[j])) {
                        maxSize = -1
                        break
                    }
                }
            }
            // found the longest string that is not a subsequence of any other strings
            if (maxSize > 0) {
                return maxSize
            }
            i--
        }
        return -1
    }

    // time complexity - O(k)
    private fun isSubsequence(s1: String, s2: String): Boolean {
        val n = s1.length
        val m = s2.length
        var i = 0
        var j = 0
        while (i < n && j < m) {
            if (s1[i] == s2[j])
                i++
            j++
        }
        return i == n;
    }
}