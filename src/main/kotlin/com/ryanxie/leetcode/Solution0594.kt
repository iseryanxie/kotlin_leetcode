package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * first build a hashmap to store the frequency of each integer
 * find the max of freqMap(i) + freqMap(i+1) in the dictionary,
 * because anything between can be deleted to form substring
 */
class Solution0594 {
    fun findLHS(nums: IntArray): Int {
        val freqMap = HashMap<Int, Int>()
        nums.forEach {
            freqMap[it] = freqMap.getOrDefault(it, 0) + 1
        }
        var max = 0
        freqMap.keys.forEach {
            if (freqMap.containsKey(it + 1)) {
                max = maxOf(max, freqMap[it]!! + freqMap[it + 1]!!)
            }
        }
        return max
    }
}