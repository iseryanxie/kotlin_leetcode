package com.ryanxie.leetcode

import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isFalse
import strikt.assertions.isTrue

class Solution0208Test{
    private val solution = Solution0208()

    @Test
    fun test1(){
        solution.insert("apple")
        expectThat(solution.search("apple")).isTrue()
        expectThat(solution.search("app")).isFalse()
        expectThat(solution.startsWith("apple")).isTrue()
        expectThat(solution.startsWith("app")).isTrue()
        solution.insert("app")
        expectThat(solution.search("app")).isTrue()
        expectThat(solution.startsWith("app")).isTrue()
    }

}