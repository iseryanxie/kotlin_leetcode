package com.ryanxie.leetcode

import jdk.vm.ci.code.CodeUtil.K
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
        if (pq.size == K) {
            if (pq.peek() < ele) {
                pq.poll()
                pq.offer(ele)
            }
        } else {
            pq.offer(ele)
        }
        return pq.peek()
    }
}