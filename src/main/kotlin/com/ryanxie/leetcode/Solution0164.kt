package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0164 {
    fun maximumGap(nums: IntArray): Int {
        if (nums.size < 2) {
            return 0
        }
        val min = nums.minOrNull()!!
        val max = nums.maxOrNull()!!
        //
        val bucketSize = maxOf(1, (max - min) / (nums.size - 1))
        val bucketCount = (max - min) / bucketSize + 1
        val buckets = Array(bucketCount) { Bucket() }
        for (num in nums) {
            val bucketIndex = (num - min) / bucketSize
            buckets[bucketIndex].update(num)
        }
        var prevBucketMax = min
        var maxGap = 0
        for (bucket in buckets) {
            if (!bucket.used) {
                continue
            }
            maxGap = maxOf(maxGap, bucket.min - prevBucketMax)
            prevBucketMax = bucket.max
        }
        return maxGap
    }

    class Bucket {
        // used to check if the bucket is empty
        var used = false
        // min and max value in the bucket
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE

        // add a new value to the bucket
        fun update(num: Int) {
            used = true
            min = minOf(min, num)
            max = maxOf(max, num)
        }
    }
}