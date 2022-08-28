package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use one hashmap to store the occurrences of first two nums possible sums, say sum=-2 for 3 times, etc.
 * Then in the last two nums, if the remaining sum + key of the map =0, then result += value
 */
class Solution0454 {
    fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
        val sumOccurrenceMap = mutableMapOf<Int, Int>()
        nums1.forEach { n1 ->
            nums2.forEach { n2 ->
                sumOccurrenceMap[n1 + n2] = sumOccurrenceMap[n1 + n2]?.plus(1) ?: 1
            }
        }
        var result = 0
        nums3.forEach { n3 ->
            nums4.forEach { n4 ->
                val sum = n3 + n4
                sumOccurrenceMap[-sum]?.let {v -> result += v}
            }
        }
        return result
    }
}