package com.ryanxie.leetcode
/**
 * Write your thoughts here
 * we know it will take n*n steps, to fill the matrix one by one
 * use direction to move and update directions as pointer reaches the boundary or already filled cells
 */

class Solution0059 {
    enum class Direction {
        UP, DOWN, LEFT, RIGHT
    }
    fun generateMatrix(n: Int): Array<IntArray> {
        val result = Array(n) { IntArray(n) }
        var i = 0
        var j = 0
        var count = 1
        var direction = Direction.RIGHT
        while (count <= n * n) {
            result [i][j] = count
            count++
            when (direction) {
                Direction.RIGHT -> {
                    if (j + 1 < n && result[i][j + 1] == 0) {
                        j++
                    } else {
                        direction = Direction.DOWN
                        i++
                    }
                }
                Direction.DOWN -> {
                    if (i + 1 < n && result[i + 1][j] == 0) {
                        i++
                    } else {
                        direction = Direction.LEFT
                        j--
                    }
                }
                Direction.LEFT -> {
                    if (j - 1 >= 0 && result[i][j - 1] == 0) {
                        j--
                    } else {
                        direction = Direction.UP
                        i--
                    }
                }
                Direction.UP -> {
                    if (i - 1 >= 0 && result[i - 1][j] == 0) {
                        i--
                    } else {
                        direction = Direction.RIGHT
                        j++
                    }
                }
            }
        }
        return result
    }
}
