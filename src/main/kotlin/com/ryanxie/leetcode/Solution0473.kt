package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 */
class Solution0473 {
    data class Memo(val side1: Int, val side2: Int, val side3: Int, val side4: Int, val index: Int)

    fun makesquare(matchsticks: IntArray): Boolean {
        if (matchsticks.size < 4) {
            return false
        }
        val sum = matchsticks.sum()
        if (sum % 4 != 0) {
            return false
        }
        val side = sum / 4
        // sort and start from the largest, which makes things faster
        Arrays.sort(matchsticks)

        // add memo to avoid TLE
        val memos = mutableMapOf<Memo, Boolean>()

        // dfs
        // sides: to record the current length of each side
        // index: the current matchstick index
        // use memo to get the result faster
        fun dfs(index: Int, a: Int, b: Int, c: Int, d: Int): Boolean {
            if (index == -1) {
                return a == side && b == side && c == side && d == side
            }
            if (a > side || b > side || c > side || d > side) return false
            val memo = Memo(a, b, c, d, index)
            if (memos.containsKey(memo)) {
                return memos[memo]!!
            }
            val curr = matchsticks[index]
            val result = dfs(index - 1, a + curr, b, c, d) || dfs(index - 1, a, b + curr, c, d) || dfs(
                index - 1,
                a,
                b,
                c + curr,
                d
            ) || dfs(index - 1, a, b, c, d + curr)
            memos[memo] = result
            return result
        }
        return dfs(matchsticks.lastIndex, 0, 0, 0, 0)

    }


}