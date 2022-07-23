package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * consider the problem as
 * 1. linked list
 * 2. Floyd's cycled linked list algorithm
 */
class Solution0287 {
    fun findDuplicate(nums: IntArray): Int {
        var slow = nums[0]
        var fast = nums[nums[0]]
        while (slow != fast) {
            slow = nums[slow]
            // fast jumps two nodes each time
            fast = nums[nums[fast]]
        }
        // one pointer start from 0, the other pointer starts from the intersection of slow and fast
        var slow2 = 0
        while (slow != slow2) {
            slow = nums[slow]
            slow2 = nums[slow2]
        }
        return slow
    }

}