package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * use morris traversal to get the sorted order
 * find the first element that is not in order -> first wrong element = prev
 * find the second element that is not in order -> second wrong element = curr
 */
class Solution0099 {
    fun recoverTree(root: TreeNode?): Unit {
        var prev: TreeNode? = null
        var firstWrong: TreeNode? = null
        var secondWrong: TreeNode? = null
        var curr: TreeNode? = root
        while (curr != null) {
            if (curr.left == null) {
                if (prev != null && prev.`val` > curr.`val`) {
                    if (firstWrong == null) {
                        firstWrong = prev
                    }
                    secondWrong = curr
                }
                prev = curr
                curr = curr.right
            } else {
                var temp = curr.left
                while (temp!!.right != null && temp.right != curr) {
                    temp = temp.right // find the rightmost node of left subtree
                }
                if (temp.right == null) {
                    temp.right = curr
                    curr = curr.left // set up the rightmost node of left subtree as the root
                } else {
                    if (prev != null && prev.`val` > curr.`val`) { // find the wrong element
                        if (firstWrong == null) {
                            firstWrong = prev
                        }
                        secondWrong = curr
                    }
                    prev = curr
                    temp.right = null
                    curr = curr.right
                }
            }
        }
        firstWrong!!.`val` = secondWrong!!.`val`.also { secondWrong!!.`val` = firstWrong!!.`val` }
    }
}