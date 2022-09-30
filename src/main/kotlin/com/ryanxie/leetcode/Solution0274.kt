package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0274 {
    fun hIndex(citations: IntArray): Int {
        citations.sortDescending()
        var h = 0
        for (i in citations.indices) {
            if (citations[i] >= i + 1) { // i+1 because i starts from 0
                h = i + 1
            }
        }
        return h
    }
}