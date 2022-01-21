package com.ryanxie.leetcode
/**
 * Write your thoughts here
 */
class Solution0589 {

    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }
    val orderList = mutableListOf<Int>()
    fun preorder(root: Node?): List<Int> {
        root ?: return orderList
        orderList.add(root.`val`)
        for (child in root.children) preorder(child)
        return orderList
    }
}
