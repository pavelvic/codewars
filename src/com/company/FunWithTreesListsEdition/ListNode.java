package com.company.FunWithTreesListsEdition;

import java.util.Objects;

class ListNode {
    public int data;
    public ListNode next;

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    ListNode(int data) {
        this(data, null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;

        ListNode listNode = (ListNode) o;

        if (data != listNode.data) return false;
        return Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        int result = data;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
