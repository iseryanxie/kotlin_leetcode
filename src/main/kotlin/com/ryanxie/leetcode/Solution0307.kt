package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * build segment tree
 */
class NumArray(nums: IntArray) {

    private val root = buildTree(nums, 0, nums.size - 1)
    private fun buildTree(nums: IntArray, start: Int, end: Int): SegmentTreeNode? {
        if (start > end) return null
        val root = SegmentTreeNode(start, end)
        if (start == end) {
            root.sum = nums[start]
            return root
        }
        val mid = start + (end - start) / 2
        root.left = buildTree(nums, start, mid)
        root.right = buildTree(nums, mid + 1, end)
        root.sum = (root.left?.sum ?: 0) + (root.right?.sum ?: 0)
        return root
    }
    fun update(index: Int, value: Int) {
        updateTree(root, index, value)
    }
    private fun updateTree(root: SegmentTreeNode?, index: Int, value: Int) {
        if (root == null) return
        if (root.start == index && root.end == index) {
            root.sum = value
            return
        }
        val mid = root.start + (root.end - root.start) / 2
        if (index <= mid) {
            updateTree(root.left, index, value)
        } else {
            updateTree(root.right, index, value)
        }
        root.sum = (root.left?.sum ?: 0) + (root.right?.sum ?: 0)
    }
    fun sumRange(left: Int, right: Int): Int {
        return sumRangeTree(root, left, right)
    }
    private fun sumRangeTree(root: SegmentTreeNode?, left: Int, right: Int): Int {
        if (root == null) return 0
        if (root.start == left && root.end == right) {
            return root.sum
        }
        val mid = root.start + (root.end - root.start) / 2
        return if (right <= mid) {
            sumRangeTree(root.left, left, right)
        } else if (left > mid) {
            sumRangeTree(root.right, left, right)
        } else {
            sumRangeTree(root.left, left, mid) + sumRangeTree(root.right, mid + 1, right)
        }
    }
}

class SegmentTreeNode(var start: Int, var end: Int) {
    var sum: Int = 0
    var left: SegmentTreeNode? = null
    var right: SegmentTreeNode? = null
}
