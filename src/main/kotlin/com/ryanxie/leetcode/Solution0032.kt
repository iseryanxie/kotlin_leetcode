package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0032 {
    // use dp
    fun longestValidParentheses(s: String): Int {
        val n = s.length
        if (n == 0) return 0
        // dp[i] is the longest valid parentheses ending at i
        val dp = IntArray(n)
        for (i in 1 until n) {
            // i - dp[i-1] - 1 is the index of the previous valid substring
            if (s[i] == ')' && i - dp[i - 1] - 1 >= 0 && s[i - dp[i - 1] - 1] == '(') {
                dp[i] = dp[i - 1] + 2 + (if (i - dp[i - 1] - 2 >= 0) dp[i - dp[i - 1] - 2] else 0)
            }
        }
        return dp.maxOrNull() ?: 0
    }
    // use stack
//    fun longestValidParentheses(s: String): Int {
//        val stack = mutableListOf<Int>()
//        var max = 0
//        var start = -1
//        for (i in s.indices) {
//            if (s[i] == '(') {
//                stack.add(i)
//            } else {
//                if (stack.isEmpty()) {
//                    start = i
//                } else {
//                    stack.removeAt(stack.lastIndex)
//                    if (stack.isEmpty()) {
//                        max = Math.max(max, i - start)
//                    } else {
//                        max = Math.max(max, i - stack.last())
//                    }
//                }
//            }
//        }
//        return max
//    }
}