package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 */
class Solution0220 {
    fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
        if (nums.isEmpty() || k < 1 || t < 0) {
            return false
        }
        // TreeSet is a binary search tree, which can easily find the floor (max value in the set that is smaller than value)
        // and ceiling (min value in the set that is greater than value) of a given value.
        // Use long to avoid integer overflow.
        val slidingWindowTreeSet = TreeSet<Long>()
        for (i in nums.indices) {
            val num = nums[i].toLong()
            val floor = slidingWindowTreeSet.floor(num)
            if (floor != null && num - floor <= t) {
                return true
            }
            val ceiling = slidingWindowTreeSet.ceiling(num)
            if (ceiling != null && ceiling - num <= t) {
                return true
            }
            slidingWindowTreeSet.add(num)
            if (slidingWindowTreeSet.size > k) {
                slidingWindowTreeSet.remove(nums[i - k].toLong())
            }
        }
        return false
    }
}