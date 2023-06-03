package com.company.FunWithListsTreesEdition;

import com.company.KataDescription;

import java.util.ArrayList;
import java.util.List;

@KataDescription(
        name = "Fun with lists: trees edition",
        Sensei = "janitormeir",
        kyu = 5,
        link = "https://www.codewars.com/kata/5866ce53dbca9af9940000d3")
public class FunWithListsTreesEdition {
    public static TreeNode flatten(ListNode head) {
        List<Integer> valuesOfNodes = new ArrayList<>();
        if (head == null) return null;
        searchTreeNodesInList(head, valuesOfNodes);
        int[] arr = valuesOfNodes.stream().mapToInt(n -> n).distinct().sorted().toArray();
        return arrayToTree(arr, 0);
    }

    static TreeNode arrayToTree(int[] array, int index) {
        if (index >= array.length) return null;
        return new TreeNode(array[index], arrayToTree(array, index * 2 + 1), arrayToTree(array, index * 2 + 2));
    }

    static void searchTreeNodesInList(ListNode node, List<Integer> valuesOfNodes) {
        getValuesOfTree(node.data, valuesOfNodes);
        if (node.next == null) {
            return;
        }
        searchTreeNodesInList(node.next, valuesOfNodes);
    }

    public static void getValuesOfTree(TreeNode root, List<Integer> valuesOfNodes) {
        if (root == null) {
            return;
        }
        getValuesOfTree(root.left, valuesOfNodes);
        getValuesOfTree(root.right, valuesOfNodes);
        valuesOfNodes.add(root.value);
    }
}