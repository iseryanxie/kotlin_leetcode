package com.ryanxie.leetcode

/**
 * Write your thoughts here
 */
class Solution0433 {
    fun minMutation(startGene: String, endGene: String, bank: Array<String>): Int {
        val bankSet: MutableSet<String> = bank.toMutableSet()
        if (!bankSet.contains(endGene)) return -1
        // BFS
        // create a queue to store the possible gene that is i-step away from startGene
        val queue = ArrayDeque<String>()
        queue.add(startGene)
        var level = 0
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val gene = queue.removeFirst()
                if (gene == endGene) return level
                for (j in gene.indices) {
                    for (c in charArrayOf('A', 'C', 'G', 'T')) {
                        val newGene = gene.substring(0, j) + c + gene.substring(j + 1)
                        if (bankSet.contains(newGene)) {
                            queue.add(newGene)
                            // remove the gene from bank to avoid duplicate
                            // we will find how many steps it takes from newGene to endGene, so no need to maintain it
                            // in the bank
                            bankSet.remove(newGene)
                        }
                    }
                }
            }
            level++
        }
        return -1
    }
}