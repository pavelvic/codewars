package com.company.FunWithTreesListsEdition;

import com.company.FunWithListsTreesEdition.FunWithListsTreesEdition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FunWithTreesListsEditionTest {

    @Test
    public void nullTree() {
        assertNull(FunWithListsTreesEdition.flatten(null));
    }

    @Test
    public void exampleTree() {
        ListNode l1 = new ListNode(17, new ListNode(1));
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(16);
        ListNode l6 = new ListNode(7, new ListNode(3));
        TreeNode root = new TreeNode(l1, new TreeNode(l2, new TreeNode(l4), null), new TreeNode(l3, new TreeNode(l5), new TreeNode(l6)));

        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(7, new ListNode(16, new ListNode(17))))));
        var actual = FunWithTreesListsEdition.flatten(root);
        assertEquals(expected, actual);
    }
}