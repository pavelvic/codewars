package com.company.FunWithListsTreesEdition;

import org.junit.Test;
import static org.junit.Assert.*;


public class FunWithListsTreesEditionTest {
    @Test
    public void nullList() {
        assertNull(FunWithListsTreesEdition.flatten(null));
    }

    @Test
    public void exampleList() {
        TreeNode t1 = new TreeNode(1, null, new TreeNode(2));
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, new TreeNode(4), new TreeNode(2));
        TreeNode t4 = new TreeNode(6, null, new TreeNode(5));

        ListNode head = new ListNode(t1, new ListNode(t2, new ListNode(t3, new ListNode(t4))));
        TreeNode expected = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        TreeNode actual = FunWithListsTreesEdition.flatten(head);
        assertEquals(expected, actual);
    }
}
