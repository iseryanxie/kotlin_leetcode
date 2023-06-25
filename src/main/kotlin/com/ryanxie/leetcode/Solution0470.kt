package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0470 {
    fun rand10(): Int {
        var row = 0
        var col = 0
        var idx = 0
        do {
            // generate 2 random number between 1 and 7
            row = rand7()
            col = rand7()
            // convert the two random number into the the index between 1 and 49
            idx = col + (row - 1) * 7
        } while (idx > 40)
        // if idx is > 40, then the distribution of the idx is not uniform, we regenerate the random number
        // for idx between 1 and 40, the distribution of (idx-1)%10 is uniform between 0 and 9
        return 1 + (idx - 1) % 10

    }

    fun rand7(): Int {
        return (Math.random() * 7).toInt() + 1
    }
}