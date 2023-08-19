package com.ryanxie.leetcode

import java.util.*

/**
 * Write your thoughts here
 *
 */
/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */
class Solution0703(val k: Int, val nums: IntArray) {

    val pq = PriorityQueue { a: Int, b: Int -> a - b } // min-heap

    init {
        for (ele in nums) {
            add(ele)
        }
    }

    fun add(ele: Int): Int {
        if (pq.size == k) {
            if (pq.peek() < ele) {
                // if the new element is larger than the smallest element in the heap
                // remove the smallest element and add the new element
                pq.poll()
                pq.offer(ele)
            }
        } else {
            pq.offer(ele)
        }
        return pq.peek()
    }
}