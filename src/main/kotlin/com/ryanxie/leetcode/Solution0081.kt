package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * use arrays to store the rows and columns that needs to be zero, before start to change matrix
 */
class Solution0081 {
    fun search(nums: IntArray, target: Int): Boolean {
        if (nums.isEmpty()) return false
        var low = 0
        var high = nums.size - 1
        while (low <= high) {
            var mid = low + (high - low) / 2
            if (nums[mid] == target) return true
            if (nums[low]==nums[mid] && nums[mid]==nums[high]){
                // to handle below cases
                // 1,0,1,1,1
                // 1,1,1,0,1
                low++
                high--
                continue
            }
            // if left array is sorted
            if (nums[low] <= nums[mid]) {
                // if target is in the left array
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1
                } else {
                    low = mid + 1
                }
            }
            // if right array is sorted
            else {
                // if target is in the right array
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1
                } else {
                    high = mid - 1
                }
            }
        }
        return false
    }
}