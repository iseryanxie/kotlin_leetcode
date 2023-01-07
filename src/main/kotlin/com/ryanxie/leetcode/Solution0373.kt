package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 * 1. Use binary search
 * First, use binary search to find the number that equals the largest pair sum of K smallest pairs
 * Second, just add all pairs that sum is less than the number found in step 1
 * 2. Use priority queue
 */
class Solution0373 {
    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        if (nums1.isEmpty() || nums2.isEmpty()) return emptyList()
        // create a priority queue of index number of each list nums1 and nums2, and order by the sum of the pair
        val pq = PriorityQueue<Pair<Int, Int>>(compareBy { nums1[it.first] + nums2[it.second] })
        pq.offer(Pair(0, 0)) // start with index (0,0)
        val result = mutableListOf<List<Int>>()
        while (result.size < k && pq.isNotEmpty()) {
            val (i, j) = pq.poll() // the index of the smallest pair sum
            result.add(listOf(nums1[i], nums2[j]))
            // if the index is (0,j), add (0,j+1) to the queue, because (i=0,j+1) or (i+1,j) is the next smallest pair sum
            if (i == 0 && j + 1 < nums2.size) pq.offer(Pair(i, j + 1))
            // if the index is (i,j), add (i+1,j) to the queue, because (i, j+1) must already in the queue from previous line
            if (i + 1 < nums1.size) pq.offer(Pair(i + 1, j))
        }
        return result
    }
//    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
//        if (nums1.isEmpty() || nums2.isEmpty()) return emptyList()
//        val n = nums1.size
//        val m = nums2.size
//        var lo = nums1[0] + nums2[0] // smallest sum
//        var hi = nums1[n - 1] + nums2[m - 1] // largest sum
//        while (lo < hi) {
//            val mid = lo + (hi - lo) / 2
//            if (countSmallerOrEqualTo(nums1, nums2, mid) < k) {
//                lo = mid + 1
//            } else {
//                hi = mid
//            }
//        }
//        val boundary = lo
//        val resultPairs = mutableListOf<List<Int>>()
//        for (i in 0 until n) {
//            if (nums1[i] + nums2[0] > boundary) break
//            var j = m - 1
//            while (j >= 0 && nums1[i] + nums2[j] >= boundary) j--
//            for (k in 0..j) {
//                resultPairs.add(listOf(nums1[i], nums2[k]))
//            }
//        }
//        var remainingCount = k - resultPairs.size
//        var j = m - 1
//        for (i in 0 until n) {
//            while (j >= 0 && nums1[i] + nums2[j] > boundary) j--
//            var h = j
//            while (h >= 0 && nums1[i] + nums2[h] == boundary) {
//                if (remainingCount > 0) {
//                    resultPairs.add(listOf(nums1[i], nums2[h]))
//                    remainingCount--
//                }
//                if (remainingCount == 0) break
//                h--
//            }
//        }
//        return resultPairs
//    }
//    // count the number of pairs that sum is less than or equal to the boundary
//    private fun countSmallerOrEqualTo(nums1: IntArray, nums2: IntArray, target: Int): Int {
//        // Since two arrays are sorted, use two pointers
//        // one start from left, one start from right
//        var j = nums2.size - 1
//        var count = 0
//        for (i in nums1.indices) {
//            while(j >= 0 && nums1[i] + nums2[j] > target) {
//                j--
//            }
//            count += j + 1
//        }
//        return count
//    }
}