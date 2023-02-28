package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0398(nums: IntArray) {
    val numToIndexes = nums
        .mapIndexed { index, num -> num to index }
        .groupBy { it.first }
        .mapValues { it.value.map { it.second } }
        .toMutableMap()
    fun pick(target: Int): Int {
        // return index of target using random
        return numToIndexes[target]?.random() ?: -1
    }
}