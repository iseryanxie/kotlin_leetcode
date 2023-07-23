package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0109 {
    fun sortedListToBST(head: ListNode?): TreeNode? {
        val list = mutableListOf<Int>()
        var node = head
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }
        fun dfs(i: Int, j: Int): TreeNode? {
            if (i > j) return null
            if (i == j) return TreeNode(list[i])
            // find the middle point
            val mid = (i + j) / 2
            val self = TreeNode(list[mid])
            // BST left child is the middle point of the left half in the sorted list
            self.left = dfs(i, mid - 1)
            self.right = dfs(mid + 1, j)
            return self
        }
        return dfs(0, list.size - 1)
    }
}