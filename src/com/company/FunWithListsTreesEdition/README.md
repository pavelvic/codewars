ou are given a linked list (head), where every element points to the root of an integer binary tree. Implement the method flatten which returns a binary tree from the values of all the trees, without duplicates, sorted by levels (while creating nodes by depth, from left to right).

For example, given the following list:

1 -> 4 -> 3 -> 6
 \       / \    \
  2     4   2    5
The method should return the following tree:

          1
       /     \
      2       3
     / \     /
    4   5   6   
(since after removing duplicates & sorting we get the following elements: 1,2,3,4,5,6 and then fill up the tree by depth from left to right)

The classes ListNode & TreeNode are available for you:

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

class TreeNode {

  public TreeNode left;
  public TreeNode right;
  public int value;
  
  TreeNode(int value, TreeNode left, TreeNode right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
  
  TreeNode(int value) {
    this(value, null, null);
  }
  ...
}
This kata is sponsored by fun with trees & fun with lists collections!

Check out Fun with trees: lists edition as well!