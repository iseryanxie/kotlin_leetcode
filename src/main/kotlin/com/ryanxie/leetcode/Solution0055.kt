package com.ryanxie.leetcode
/**
 * Write your thoughts here
 *
 */

class Solution0055 {
    // greedy O(n), from the end of array,
    // we update the maxReachableIndex based on whether it is reachable by the previous index
//    fun canJump(nums: IntArray): Boolean {
//        var maxReachableIndex = nums.size - 1
//        if (maxReachableIndex == 0) {
//            return true
//        }
//        for (i in nums.size - 2 downTo 0) {
//            if (maxReachableIndex - i <= nums[i]){
//                maxReachableIndex = i
//            }
//        }
//        return maxReachableIndex <= 0
//    }
    // greedy O(n), from start to end, as long as you can reach N, any index before N is also reachable
    // because you can jump between 0 and i
    fun canJump(nums: IntArray): Boolean {
        var maxReachableIndex = 0
        for (i in nums.indices) {
            if (i > maxReachableIndex) {
                return false
            }
            maxReachableIndex = Math.max(maxReachableIndex, i + nums[i])
        }
        return true
    }

    // recursion, time limit exceeded
//    val canJump = HashMap<Int, Boolean>()
//    fun canJump(nums: IntArray, idx: Int): Boolean{
//        if (idx >= nums.size - 1) {
//            canJump[idx] = true
//            return true
//        }
//        for (i in 1..nums[idx]){
//            if (canJump.contains(idx + i)) {
//                return true
//            }
//            if (idx + i <= nums.size && canJump(nums, idx + i)){
//                canJump[idx + i] = true
//                return true
//            }
//        }
//        return false
//    }
//    fun canJump(nums: IntArray): Boolean {
//
//        return canJump(nums, 0)
//    }
}
