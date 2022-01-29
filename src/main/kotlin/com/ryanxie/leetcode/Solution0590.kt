package com.ryanxie.leetcode
/**
 * Write your thoughts here
 */
class Solution0590 {

    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }
    fun postorder(root: Node?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) {
            return result
        }
        root.children.forEach {
            result.addAll(postorder(it))
        }
        result.add(root.`val`)
        return result
    }
}
