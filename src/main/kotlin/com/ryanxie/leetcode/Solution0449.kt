package com.ryanxie.leetcode


/**
 * Write your thoughts here
 */
class Solution0449 {
    companion object {
        const val NULL = "-"
        const val DELIM = ","
    }
    // Encodes a BST tree to a single string.
    fun serialize(root: TreeNode?): String {
        val stringBuilder = StringBuilder()
        serializeHelper(root, stringBuilder)
        return stringBuilder.toString()
    }
    private fun serializeHelper(root: TreeNode?, stringBuilder: StringBuilder) {
        if (root == null) {
            stringBuilder.append("$NULL$DELIM")
            return
        }
        stringBuilder.append(root.`val`)
        stringBuilder.append(DELIM)
        serializeHelper(root.left, stringBuilder)
        serializeHelper(root.right, stringBuilder)
    }

    // Decodes your encoded data to tree.

    fun deserialize(data: String): TreeNode? {
        if(data.isEmpty()) return null

        val array = data.split(DELIM)
        val rootValue = (if (array[0] == NULL) null else array[0].toInt()) ?: return null
        val root = TreeNode(rootValue)

        for(i in 1 until array.size - 1) {
            val nodeValue = if (array[i] == NULL) null else array[i].toInt()
            insertElementToTree(nodeValue, root)
        }

        return root
    }

    private fun insertElementToTree(value: Int?, node: TreeNode) {
        if (value == null) return
        if(value < node.`val`) {
            if(node.left == null) {
                node.left = TreeNode(value)
            } else {
                insertElementToTree(value, node.left!!)
            }
        } else {
            if(node.right == null) {
                node.right = TreeNode(value)
            } else {
                insertElementToTree(value, node.right!!)
            }
        }
    }

}