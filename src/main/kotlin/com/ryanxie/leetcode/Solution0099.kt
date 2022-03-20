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
//    fun recoverTree(root: TreeNode?): Unit {
//        var first: TreeNode? = null
//        var second: TreeNode? = null
//        var prev: TreeNode? = null
//        var firstTime = true
//        var curr: TreeNode? = root
//        while (curr != null) {
//            if (curr.left != null) {
//                var temp = curr.left
//                while (temp!!.right != null && temp.right != root) {
//                    temp = temp.right // find the rightmost node of left subtree
//                }
//                if (temp.right == null) {
//                    temp.right = curr
//                    curr = curr.left // set up the rightmost node of left subtree as the root
//                } else {
//                    // finished traversal the tree at root, restore the tree
//                    temp.right = null
//                    // visit the root value
//                    if (prev != null && prev.`val` > curr.`val` && firstTime) {
//                        first = prev
//                        firstTime = false
//                    }
//                    if (prev != null && prev.`val` > curr.`val` && !firstTime) {
//                        second = curr
//                    }
//                    prev = root
//                    curr = curr.right
//                }
//            } else {
//                // visit the curr value
//                if (prev != null && prev.`val` > curr.`val` && firstTime) {
//                    first = prev
//                    firstTime = false
//                }
//                if (prev != null && prev.`val` > curr.`val` && !firstTime) {
//                    second = curr
//                }
//                prev = root
//                curr = curr.right
//            }
//        }
//        // swap the values of first and second
//        first!!.`val` = second!!.`val`.also { second!!.`val` = first!!.`val` }
//    }
}