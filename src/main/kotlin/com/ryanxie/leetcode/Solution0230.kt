package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 */
class Solution0230 {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        if (root == null) return 0
        val stack = Stack<TreeNode>()
        var count = 0
        var node = root
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                // put path into the stack
                stack.push(node)
                node = node.left
            }
            // move back to the parent node
            node = stack.pop()
            // visit the node
            count++
            if (count == k) return node.`val`
            // move to the right child
            node = node.right
        }
        return 0
    }
}