package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * Use trie to store all the numbers
 */
class Solution0421 {
    class Node {
        val children = arrayOfNulls<Node>(2)
    }
    fun findMaximumXOR(nums: IntArray): Int {
        val root = Node()
        for (num in nums) {
            // insert num into trie
            var node = root
            // int can be represented as 32 bits
            for (i in 31 downTo 0) {
                // get the i-th bit
                val bit = (num shr i) and 1
                // if the bit is not in the trie, add it
                if (node.children[bit] == null) {
                    node.children[bit] = Node()
                }
                // move to the next node
                node = node.children[bit]!!
            }
        }
        var max = 0
        for (num in nums) {
            var node = root
            var xor = 0
            for (i in 31 downTo 0) {
                // get the i-th bit of the number
                val bit = (num shr i) and 1
                if (node.children[bit xor 1] != null) {
                    // if the opposite bit exists, we can get a larger xor
                    xor = xor or (1 shl i)
                    // move to the opposite bit
                    node = node.children[bit xor 1]!!
                } else {
                    node = node.children[bit]!!
                }
            }
            // update the max xor
            max = maxOf(max, xor)
        }
        return max
    }
}