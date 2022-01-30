package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * 1. recursion is too slow
 * 2. dp forward is acceptable
 * 3. directly compute the result, handle overflow problem
 */
class Solution0062 {
    // Recursion, Too slow
//    fun uniquePaths(m: Int, n: Int): Int {
//        if (m==1 || n==1) return 1
//        return uniquePaths(m-1,n) + uniquePaths(m,n-1)
//    }
    // dp, forward path
//    fun uniquePaths(m: Int, n: Int): Int {
//        if (m==1 || n==1) return 1
//        val dp = Array(m) { IntArray(n) }
//        for (i in 0 until m) {
//            for (j in 0 until n) {
//                if (i==0 || j==0) dp[i][j] = 1
//                else dp[i][j] = dp[i-1][j] + dp[i][j-1]
//            }
//        }
//        return dp[m-1][n-1]
//    }
    fun uniquePaths(m: Int, n: Int): Int {
        // The result is (m+n-2) choose (m-1)
        // convert to Long to avoid Integer overflow
        val chooseFrom: Long = (maxOf(n,m)-1).toLong()
        val total: Long = (m+n-2).toLong()
        // product of all numbers from chooseFrom+1 to total
        val numerator: Long = (chooseFrom+1..total).fold(1L) { acc, i -> acc * i }
        // product of all numbers from 1 to chooseFrom
        val denominator: Long = (1..(total-chooseFrom)).fold(1L) { acc, i -> acc * i }
        return (numerator / denominator).toInt()
    }

}