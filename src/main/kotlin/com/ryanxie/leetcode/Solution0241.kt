package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0241 {
    fun diffWaysToCompute(expression: String): List<Int> {
        // memoization
        val memo = mutableMapOf<String, List<Int>>()
        if (expression in memo) return memo[expression]!!
        val result = mutableListOf<Int>()
        for (i in expression.indices) {
            if (expression[i] == '+' || expression[i] == '-' || expression[i] == '*') {
                val left = diffWaysToCompute(expression.substring(0, i))
                val right = diffWaysToCompute(expression.substring(i + 1))
                for (l in left) {
                    for (r in right) {
                        when (expression[i]) {
                            '+' -> result.add(l + r)
                            '-' -> result.add(l - r)
                            '*' -> result.add(l * r)
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) {
            result.add(expression.toInt())
        }
        memo[expression] = result
        return result
    }
}