package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0306 {
    fun isAdditiveNumber(num: String): Boolean {
        for (i in 1 until num.length) {
            for (j in i + 1 until num.length) {
                // for each possible i,j
                val first = num.substring(0, i)
                val second = num.substring(i, j)
                // skip numbers that start with 0
                if (first.length > 1 && first[0] == '0' || second.length > 1 && second[0] == '0') {
                    continue
                }
                if (isAdditiveNumber(first, second, num.substring(j))) {
                    return true
                }
            }
        }
        return false
    }
    private fun isAdditiveNumber(first: String, second: String, num: String): Boolean {
        if (num.isEmpty()) {
            return true
        }
        val sum = (first.toBigInteger() + second.toBigInteger()).toString()
        if (num.startsWith(sum)) {
            return isAdditiveNumber(second, sum, num.substring(sum.length))
        }
        return false
    }
}