package com.ryanxie.leetcode
/**
 * Write your thoughts here
 * the idea is to start from smallest number, each smallest number can be paired to the next smallest number
 * in this way, the sum of the smaller number in the pair is maximized
 */
class Solution0561 {

    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var sum = 0
//        for (i in 0 until nums.size step 2){
//            sum += nums[i]
//        }
//        return sum
        nums.withIndex().forEach{
            if (it.index % 2 == 0) sum += it.value
        }
        return sum

    }
}
