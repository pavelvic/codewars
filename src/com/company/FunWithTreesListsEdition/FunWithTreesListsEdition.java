package com.company.FunWithTreesListsEdition;

import com.company.KataDescription;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@KataDescription(
        name = "Fun with trees: lists edition",
        Sensei = "janitormeir",
        kyu = 5,
        link = "https://www.codewars.com/kata/586640f739c5ab4f4c00022f")
public class FunWithTreesListsEdition {
    static ListNode flatten(TreeNode root) {
        if (root == null) return null;
        List<Integer> allValues = new ArrayList<>();
        searchListNodesInTree(root, allValues);
        var sortedValues = allValues.stream().distinct().sorted().collect(Collectors.toList());
        return createListNodeFromListValues(sortedValues, 0);
    }

    static void searchListNodesInTree(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }
        searchListNodesInTree(root.left, values);
        searchListNodesInTree(root.right, values);
        getValuesOfListNode(root.value, values);
    }

    static void getValuesOfListNode(ListNode listNode, List<Integer> values) {
        values.add(listNode.data);
        if (listNode.next == null) return;
        getValuesOfListNode(listNode.next, values);
    }

    static ListNode createListNodeFromListValues(List<Integer> values, int i) {
        if (i > values.size() - 1) return null;
        return new ListNode(values.get(i), createListNodeFromListValues(values, i + 1));
    }
}