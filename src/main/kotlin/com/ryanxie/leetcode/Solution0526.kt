package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0526 {

    // visited means the index has number or not
    private fun helper(n: Int, pos: Int, visited: BooleanArray): Int {
        if (pos > n) {
            // all positions are filled, return 1 as a valid arrangement
            return 1
        }
        var count = 0
        for (i in 1..n) {
            // for all i if i is not visited and i can be put at pos
            if (!visited[i] && (i % pos == 0 || pos % i == 0)) {
                // put i at pos, mark i as visited
                visited[i] = true
                count += helper(n, pos + 1, visited)
                visited[i] = false
            }
        }
        return count
    }
    fun countArrangement(n: Int): Int {
        val visited = BooleanArray(n + 1)
        return helper(n, 1, visited)
    }
}