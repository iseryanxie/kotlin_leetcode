package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0318 {
    fun maxProduct(words: Array<String>): Int {
        val bitMasks = words.map { word ->
            word.fold(0) { acc, c ->
                acc or (1 shl (c - 'a'))
            }
        }
        var max = 0
        for (i in words.indices) {
            for (j in i + 1 until words.size) {
                if (bitMasks[i] and bitMasks[j] == 0) {
                    max = maxOf(max, words[i].length * words[j].length)
                }
            }
        }
        return max
    }
}