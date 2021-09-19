package com.ryanxie.leetcode

class Solution0007 {
    fun reverse(x: Int): Int {
        val negFlag = x < 0
        var xPos = if (negFlag) -x else x
        var ans: Long = 0
        var cur: Int
        while (xPos > 0) {
            cur = xPos % 10
            ans = ans * 10 + cur
            xPos /= 10
        }
        val ansInt = try {
            if (ans < Int.MAX_VALUE) ans.toInt() else 0
        } catch (e: Exception) {
            0
        }
        return if (negFlag) -ansInt else ansInt
    }
}