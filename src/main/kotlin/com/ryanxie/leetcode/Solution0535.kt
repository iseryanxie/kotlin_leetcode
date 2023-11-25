package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0535 {
    val TINY_URL_URL = "http://tinyurl.com"
    val TINY_URL_DELIMITER = "/api/v1/"
    val TINY_URL_LENGTH = 8
    val TINY_URL_ERROR = "Error: tinyurl not found."

    val backingMap: MutableMap<String, String> = mutableMapOf()
    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String {
        var potentialIdentifier = getRandomIdentifier()
        // keep generating a random identifier until it is not in the map
        while (backingMap.containsKey(potentialIdentifier)) {
            potentialIdentifier = getRandomIdentifier()
        }
        // save the long url to the map
        backingMap[potentialIdentifier] = longUrl
        return "${TINY_URL_URL}${TINY_URL_DELIMITER}$potentialIdentifier"
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String {
        val tokens = shortUrl.split(TINY_URL_DELIMITER)
        if (tokens.size == 2 && backingMap.containsKey(tokens[1])) {
            return backingMap[tokens[1]]!!
        }
        return TINY_URL_ERROR
    }

    // randomly generate a string of length 8

    private fun getRandomIdentifier(): String {
        val randomIdentifierBuilder = StringBuilder()
        for (index in 0 until TINY_URL_LENGTH) {
            randomIdentifierBuilder.append('a' + (0..25).random())
        }
        return randomIdentifierBuilder.toString()
    }
}