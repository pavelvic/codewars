package com.company.FunWithTreesMaxSum;

import com.company.KataDescription;

@KataDescription(
        name = "Fun with trees: max sum",
        Sensei = "janitormeir",
        kyu = 6,
        link = "https://www.codewars.com/kata/57e5279b7cf1aea5cf000359")
public class FunWithTreesMaxSum {
    static int maxSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.value;
        }

        int left = maxSum(root.left);
        int right = maxSum(root.right);
        return (Math.max(left, right)) + root.value;
    }
}
