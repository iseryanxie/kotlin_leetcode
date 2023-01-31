package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0697 {
    fun findShortestSubArray(nums: IntArray): Int {
        // store both count, start and end position of each number
        val map = mutableMapOf<Int, Triple<Int, Int, Int>>()
        for (i in nums.indices) {
            val (count, start, end) = map.getOrDefault(nums[i], Triple(0, i, i))
            map[nums[i]] = Triple(count + 1, start, i)
        }
        // sort map by count from max to min, then by end-start from min to max
        val sortedMap = map.toList()
            .sortedWith(compareByDescending<Pair<Int, Triple<Int, Int, Int>>> { it.second.first }
                .thenBy { it.second.third - it.second.second })
        return sortedMap.first().second.third - sortedMap.first().second.second + 1
    }
}