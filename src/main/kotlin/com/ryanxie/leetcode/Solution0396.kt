package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * f0 = f1 + sum - n * a[0]
 * f1 = f2 + sum - n * a[1]
 */
class Solution0396 {
    fun maxRotateFunction(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var sum = 0
        var f = 0
        for (i in nums.indices) {
            sum += nums[i]
            f += i * nums[i]
        }
        var max = f
        for (i in nums.indices.reversed()) {
            f += sum - nums.size * nums[i]
            max = max.coerceAtLeast(f)
        }
        return max
    }
}