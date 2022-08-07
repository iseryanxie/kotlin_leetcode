package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * 1. sort
 * 2. the wiggle sorted array must have small big small big... pattern
 * 3. to ensure this pattern, consider breaking the sorted array in two halves, pick a number from each half each time
 * the first small can be the largest number in first half of the sorted array
 * 4. the first big number can be the largest number of all
 * 5. and so on.
 */
class Solution0324 {
    fun wiggleSort(nums: IntArray): Unit {
        // first sort
        nums.sort()
        val temp = IntArray(nums.size)
        // temp is a copy of sorted nums
        for (i in nums.indices) {
            temp[i] = nums[i]
        }
        // if odd number, then the mid should be in the middle, e.g., 5 numbers, then the index of mid should be 2 (the 3rd number)
        // if even number, then mid should be (nums.size - 1) / 2, e.g., 4 numbers, then the index of mid should be 1 (the 2nd number)
        // because the pattern is small big small big..., so the first small number should be the largest to the first half
        var mid = (nums.size - 1) / 2
        var end = nums.size - 1
        for (i in nums.indices) {
            if (i % 2 == 0) {
                // e.g., 0, the first small number is the largest to the first half
                nums[i] = temp[mid--]
            } else {
                // the first big number is the largest number in the array
                nums[i] = temp[end--]
            }
        }
    }
}