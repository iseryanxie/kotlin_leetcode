package com.ryanxie.leetcode
/**
 * Write your thoughts here
 * increment the number of candies until it is more than half of the total number of candies
 */

class Solution0575 {
    fun distributeCandies(candyType: IntArray): Int {
        val halfSize = candyType.size / 2
        val eatSet = HashSet<Int>()
        candyType.forEach {
            if (eatSet.size < halfSize) {
                eatSet.add(it)
            } else {
                return halfSize
            }
        }
        return eatSet.size
    }

}
