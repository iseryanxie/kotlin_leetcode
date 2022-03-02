package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * numTrees(4) = numTrees(0) * numTrees(3) // if the first node is the root
 *             + numTrees(1) * numTrees(2) // if second node is root
 *             + numTrees(2) * numTrees(1)
 *             + numTrees(3) * numTrees(0)
 */
class Solution0096 {
    fun numTrees(n: Int): Int {
        val dp = IntArray (n+1) {1}
        for (nodes in 2 until n+1) {
            var total = 0
            for (root in 1 until nodes+1){
                val left = root - 1
                val right = nodes - root
                total += dp[left] * dp[right]
            }
            dp[nodes] = total
        }
        return dp[n]
    }
}