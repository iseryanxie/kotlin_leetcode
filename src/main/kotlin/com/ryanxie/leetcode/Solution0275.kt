package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use binary search
 */
class Solution0275 {
    fun hIndex(citations: IntArray): Int {
        var left = 0
        var right = citations.size
        while (left < right) {
            val mid = left + (right - left) / 2
            if (citations[mid] >= citations.size - mid) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return citations.size - left
    }
}