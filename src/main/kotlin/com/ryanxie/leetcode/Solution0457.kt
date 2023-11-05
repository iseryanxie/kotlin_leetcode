package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0457 {
    fun circularArrayLoop(nums: IntArray): Boolean {
        // use slow and fast pointer to detect cycle
        for (i in nums.indices) {
            var slow = i
            var fast = i
            // due to backward, we cannot use slow != fast because one may move backward and meet the other
            var isForward = nums[i] > 0
            while (true) {
                slow = getNextIndex(nums, slow, isForward)
                fast = getNextIndex(nums, fast, isForward)
                if (fast != -1) {
                    // move fast pointer one more step
                    fast = getNextIndex(nums, fast, isForward)
                }
                if (slow == -1 || fast == -1 || slow == fast) {
                    break
                }
            }
            if (slow != -1 && slow == fast) {
                return true
            }
        }
        return false
    }
    private fun getNextIndex(nums: IntArray, index: Int, isForward: Boolean): Int {
        val direction = nums[index] > 0
        if (isForward != direction) {
            // slow and fast must move in the same direction to form a cycle
            return -1
        }
        var nextIndex = (index + nums[index]) % nums.size
        if (nextIndex < 0) {
            nextIndex += nums.size
        }
        if (nextIndex == index) {
            return -1
        }
        return nextIndex
    }
}