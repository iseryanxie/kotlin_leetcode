package com.ryanxie.leetcode

import org.junit.Assert
import org.junit.Test

class Solution0355Test{
    private val twitter = Solution0355.Twitter()

    @Test
    fun test1(){
        twitter.postTweet(1, 5)
        Assert.assertEquals(listOf(5), twitter.getNewsFeed(1))
        twitter.follow(1, 2)
        twitter.postTweet(2, 6)
        Assert.assertEquals(listOf(6, 5), twitter.getNewsFeed(1))
        twitter.unfollow(1, 2)
        Assert.assertEquals(listOf(5), twitter.getNewsFeed(1))
    }
}