package com.company.FunWithListsTreesEdition;

class ListNode {
    public TreeNode data;
    public ListNode next;

    ListNode(TreeNode data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    ListNode(TreeNode data) {
        this(data, null);
    }
}
