package com.ryanxie.leetcode

class Solution0014 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val nStrs = strs.size
        if (nStrs == 1) return strs[0]

        strs.sort()
        val first = strs.first()
        val last = strs.last()

        val builder = StringBuilder()
        for (idx in first.indices) {
            if (first[idx] != last[idx])
                break

            builder.append(first[idx])
        }

        return builder.toString()
    }
}