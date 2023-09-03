package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0494 {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        //        // use backtracking with caching
//        val cache = mutableMapOf<Pair<Int, Int>, Int>()
//        return helper(nums, target, 0, 0, cache)
//
//
//    }
//    private fun helper(nums: IntArray, target: Int, index: Int, sum: Int, cache: MutableMap<Pair<Int, Int>, Int>): Int {
//        if (index == nums.size) {
//            if (sum == target) {
//                return 1
//            } else {
//                return 0
//            }
//        }
//        val key = Pair(index, sum)
//        if (cache.containsKey(key)) {
//            return cache[key]!!
//        }
//        val add = helper(nums, target, index + 1, sum + nums[index], cache)
//        val minus = helper(nums, target, index + 1, sum - nums[index], cache)
//        cache[key] = add + minus
//        return cache[key]!!
        // Use DP
        val sum = nums.sum()
        if (target > sum || target < -sum) {
            return 0
        }
        // dp[i][j] means the number of ways to get sum j using the first i numbers
        val dp = Array(nums.size) { IntArray(2 * sum + 1) }
        dp[0][sum + nums[0]] += 1
        dp[0][sum - nums[0]] += 1
        for (i in 1 until nums.size) {
            for (j in -sum..sum) {
                if (j + nums[i] <= sum) {
                    dp[i][j + sum] += dp[i - 1][j + nums[i] + sum]
                }
                if (j - nums[i] >= -sum) {
                    dp[i][j + sum] += dp[i - 1][j - nums[i] + sum]
                }
            }
        }
        return dp[nums.size - 1][target + sum]
    }

}