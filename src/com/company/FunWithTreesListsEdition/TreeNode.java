package com.company.FunWithTreesListsEdition;

class TreeNode {

    public TreeNode left;
    public TreeNode right;
    public ListNode value;

    TreeNode(ListNode value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    TreeNode(ListNode value) {
        this(value, null, null);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        TreeNode treeNode = (TreeNode) o;
//
//        if (value != treeNode.value) return false;
//        if (left != null ? !left.equals(treeNode.left) : treeNode.left != null) return false;
//        return right != null ? right.equals(treeNode.right) : treeNode.right == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = left != null ? left.hashCode() : 0;
//        result = 31 * result + (right != null ? right.hashCode() : 0);
//        result = 31 * result + value;
//        return result;
//    }
}
