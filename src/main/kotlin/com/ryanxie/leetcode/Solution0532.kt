package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0532 {
    fun findPairs(nums: IntArray, k: Int): Int {
        if (k < 0) {
            return 0
        }
        // create a map to store the frequency of each number
        val map = mutableMapOf<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        var count = 0
        for (entry in map.entries) {
            // for each number
            if (k == 0) {
                // if k is 0, whenever the frequency of a number is greater than 1, we can count it
                if (entry.value >= 2) {
                    count++
                }
            } else {
                // if k is not 0, we check if the map contains the number that is k greater than the current number
                if (map.containsKey(entry.key + k)) {
                    count++
                }
            }
        }
        return count
    }
}