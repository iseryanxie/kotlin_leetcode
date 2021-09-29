package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution1627 {
    fun areConnected(n: Int, threshold: Int, queries: Array<IntArray>): List<Boolean> {
        val uf = UnionFind(n + 1)
        for(i in threshold + 1..n){
            for(j in i..n step i){
                uf.union(i, j)
            }
        }

        val ans = ArrayList<Boolean>()
        for(query in queries){
            ans.add(uf.find(query[0]) == uf.find(query[1]))
        }

        return ans
    }

    private class UnionFind(n: Int){
        private val roots = IntArray(n){idx -> idx}
        private val ranks = IntArray(n){ 1 }

        fun find(i: Int): Int{
            if(roots[i] != i){
                roots[i] = find(roots[i])
            }

            return roots[i]
        }

        fun union(x: Int, y: Int){
            val rootX = find(x)
            val rootY = find(y)

            if(ranks[rootX] > ranks[rootY]){
                roots[rootY] = rootX
                ++ranks[rootX]
            }else{
                roots[rootX] = rootY
                ++ranks[rootY]
            }
        }
    }
}