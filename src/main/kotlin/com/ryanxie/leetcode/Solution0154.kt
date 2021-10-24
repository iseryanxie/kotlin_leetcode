package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.
 */
class Solution0154 {
    fun findMin(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]
        if (nums[0] < nums[nums.size - 1]) return nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] < nums[i - 1]) return nums[i]
        }
        return nums[nums.size - 1]
    }
}