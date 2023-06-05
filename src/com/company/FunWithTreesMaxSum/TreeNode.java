package com.company.FunWithTreesMaxSum;

class TreeNode {

    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
    }

    public static TreeNode leaf(int value) {
        return new TreeNode(value);
    }

    public TreeNode withLeaves(int leftVal, int rightVal) {
        left = new TreeNode(leftVal);
        right = new TreeNode(rightVal);
        return this;
    }

    public static TreeNode join(int value, TreeNode leftNode, TreeNode rightNode) {
        TreeNode node = new TreeNode(value);
        node.left = leftNode;
        node.right = rightNode;
        return node;
    }
}
