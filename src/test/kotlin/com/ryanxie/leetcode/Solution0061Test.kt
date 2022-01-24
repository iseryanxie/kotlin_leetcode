package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0061Test{
    private val solution = Solution0061()

    @Test
    fun test1(){
        val listNode1 = Solution0061.ListNode(1)
        val listNode2 = Solution0061.ListNode(2)
        val listNode3 = Solution0061.ListNode(3)
        val listNode4 = Solution0061.ListNode(4)
        val listNode5 = Solution0061.ListNode(5)
        listNode1.next = listNode2
        listNode2.next = listNode3
        listNode3.next = listNode4
        listNode4.next = listNode5
        val res = solution.rotateRight(listNode1, 2)
        Assert.assertEquals(4, res?.`val`)
        Assert.assertEquals(5, res?.next?.`val`)
        Assert.assertEquals(1, res?.next?.next?.`val`)
        Assert.assertEquals(2, res?.next?.next?.next?.`val`)
        Assert.assertEquals(3, res?.next?.next?.next?.next?.`val`)
        Assert.assertEquals(null, res?.next?.next?.next?.next?.next)
    }

    @Test
    fun test2(){
        val listNode1 = Solution0061.ListNode(1)
        val res = solution.rotateRight(listNode1, 0)
        Assert.assertEquals(1, res?.`val`)
        Assert.assertEquals(null, res?.next)
    }

}