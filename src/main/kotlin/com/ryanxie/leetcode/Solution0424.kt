package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use two points/sliding window
 */
class Solution0424 {
    fun characterReplacement(s: String, k: Int): Int {
        var res = 0
        var left = 0
        val count: MutableMap<Int, Int> = mutableMapOf()
        for (right in s.indices) {
            count[s[right] - 'A'] = count.getOrDefault(s[right] - 'A', 0) + 1
            // get max value of the array
//            val maxCount = count.values.stream().max {a, b -> a - b}.get()
            val maxCount = count.values.maxOrNull()!!
            while (right - left + 1 - maxCount > k) {
                count[s[left] - 'A'] = count[s[left] - 'A']!! - 1
                left++
            }
            res = Math.max(res, right - left + 1)
        }
        return res
    }
}