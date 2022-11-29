package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0355 {
    class Twitter {
        var timestamp: Int = 0
        data class Tweet(val id: Int, val timestamp: Int)
        private val userTweets = hashMapOf<Int, MutableList<Tweet>>()
        private val userFollowers = hashMapOf<Int, MutableSet<Int>>()

        fun postTweet(userId: Int, tweetId: Int) {
            val tweet = Tweet(tweetId, timestamp++)
            userTweets.getOrPut(userId) { mutableListOf() }.add(tweet)
        }

        fun getNewsFeed(userId: Int): List<Int> {
            val followers = userFollowers.getOrDefault(userId, mutableSetOf())
            val allTweets = (followers + userId).flatMap { userTweets.getOrDefault(it, mutableListOf()) }
            return allTweets.sortedByDescending { it.timestamp }.take(10).map { it.id }
        }

        fun follow(followerId: Int, followeeId: Int) {
            if (userFollowers.containsKey(followerId)){
                userFollowers[followerId]?.add(followeeId)
            } else {
                userFollowers[followerId] = mutableSetOf(followeeId)
            }
        }

        fun unfollow(followerId: Int, followeeId: Int) {
            if (userFollowers.containsKey(followerId)){
                userFollowers[followerId]?.remove(followeeId)
            }
        }
    }
}