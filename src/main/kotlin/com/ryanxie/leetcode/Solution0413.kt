package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0413 {
    //    fun numberOfArithmeticSlices(nums: IntArray): Int {
//        if (nums.size < 3) return 0
//        var count = 0
//        var diff = nums[1] - nums[0]
//        var start = 0
//        for (i in 2 until nums.size) {
//            if (nums[i] - nums[i - 1] == diff) {
//                // for each new element, we can find additional (i - start - 1) new arithmetic slices
//                count += i - start - 1
//            } else {
//                // reset, because difference is not the same
//                start = i - 1
//                diff = nums[i] - nums[i - 1]
//            }
//        }
//        return count
//    }
    fun numberOfArithmeticSlices(nums: IntArray): Int {
        // use dynamic programming
        if (nums.size < 3) return 0
//        val dp = IntArray(nums.size)
        var dp = 0
        var res = 0
        for (i in 2 until nums.size) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                // dp is the additional number of arithmetic slices that can be formed by adding nums[i]
                // dp[i] = dp[i - 1] + 1
                // no need to use an array, just use a variable to keep the latest dp
                dp += 1
                // final result is the sum of all dp[i]
                res += dp
            } else {
                // reset dp
                dp = 0
            }
        }
        return res
    }
}