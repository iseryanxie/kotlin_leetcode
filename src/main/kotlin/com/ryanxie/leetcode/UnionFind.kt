package com.ryanxie.leetcode

class UnionFind<T> {
//    private val parent = HashMap <T, T>()
//    private val rank = HashMap<T, Int>()
//
//    /* number of nodes */
//    fun size() = parent.size
//    fun add(x: T) {
//        parent[x] = x
//        rank[x] = 0
//    }
//    /* Find the set/root of the tree containing given node x */
//    fun find(x: T): T {
//        return if (parent[x] == x) {
//            x
//        }
//        else {
//            parent[x] = find(parent[x])
//            parent[x]
//        }
//    }
//    /* Union of two Sets which contain x and y */
//    fun union(x: T, y: T) {
//        val s = find(x)
//        val t = find(y)
//        if (s == t) return
//        if (rank[s] > rank[t]) {
//            parent += (t -> s)
//        }
//        else {
//            if (rank[s] == rank[t]) rank[t] += 1
//            parent += (s -> t)
//        }
//    }
}