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
                // visit the node
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
                        secondWrong = curr // set the second wrong element at the same time, because it could
                        // happen at the same time, for example, 1,3,2,4. In this case, the first wrong element is
                        // next to the second wrong element.
                        // a more general case is 1,3,2,4,6,5,7. In this case, there are two different wrong elements.
                    }
                    prev = curr
                    temp.right = null // finished traversal, restore the original tree
                    curr = curr.right
                }
            }
        }
        firstWrong!!.`val` = secondWrong!!.`val`.also { secondWrong!!.`val` = firstWrong!!.`val` }
    }
}