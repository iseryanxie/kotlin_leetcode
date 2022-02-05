package com.ryanxie.leetcode

/**
 * Write your thoughts here
 * use arrays to store the rows and columns that needs to be zero, before start to change matrix
 */
class Solution0073 {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val rows = ArrayList<Int>()
        val cols = ArrayList<Int>()
        for (i in matrix.indices){
            for (j in matrix[i].indices){
                if (matrix[i][j] == 0){
                    if (!rows.contains(i)){
                        rows.add(i)
                    }
                    if (!cols.contains(j)){
                        cols.add(j)
                    }
                }
            }
        }

        for (i in rows){
            for (j in matrix[i].indices){
                matrix[i][j] = 0
            }
        }

        for (i in cols){
            for (j in matrix.indices){
                matrix[j][i] = 0
            }
        }
    }
}