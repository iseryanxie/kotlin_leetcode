package com.ryanxie.leetcode

/**
 */
class Solution0397 {
    // simple calculation exceeds time limit
//    fun integerReplacement(n: Int): Int {
//        var num = n
//        var count = 0
//        while (num != 1) {
//            if (num % 2 == 0) {
//                num /= 2
//            } else {
//                if (num % 4 == 1 || num == 3) {
//                    num -= 1
//                } else {
//                    num += 1
//                }
//            }
//            count++
//        }
//        return count
//    }
    // Use dynamic programming, memory limit exceeded
//    fun integerReplacement(n: Int): Int {
//        val dp = IntArray(n + 1)
//        dp[1] = 0
//        for (i in 2..n) {
//            if (i % 2 == 0) {
//                dp[i] = dp[i / 2] + 1
//            } else {
//                dp[i] = Math.min(dp[i - 1]+1, dp[(i + 1)/2]+2)
//            }
//        }
//        return dp[n]
//    }
    // use recursion
    fun integerReplacement(n: Int): Int = when {
        n == 1 -> 0
        n == Int.MAX_VALUE -> integerReplacement(n - 1)
        n and 1 == 0 -> integerReplacement(n / 2) + 1
        else -> minOf(integerReplacement(n + 1), integerReplacement(n - 1)) + 1
    }
}