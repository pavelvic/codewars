package com.company.FunWithTreesMaxSum;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class FunWithTreesMaxSumTest {

    /**
     * null
     */
    @Test
    public void maxSumInNullTree() {
        TreeNode root = null;
        assertThat(FunWithTreesMaxSum.maxSum(root), is(0));
    }

    /**
     *      5
     *    /   \
     *  -22    11
     *  / \    / \
     * 9  50  9   2
     */
    @Test
    public void maxSumInPerfectTree() {
        TreeNode left = TreeNode.leaf(-22).withLeaves(9, 50);
        TreeNode right = TreeNode.leaf(11).withLeaves(9, 2);
        TreeNode root = TreeNode.join(5, left, right);
        assertThat(FunWithTreesMaxSum.maxSum(root), is(33));
    }
}
