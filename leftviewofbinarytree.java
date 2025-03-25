package trees;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    // Function to return list containing elements of left view of binary tree.
    int maxlevel = 0;

    ArrayList<Integer> leftView(Node root) {
        // code here

        ArrayList<Integer> arr = new ArrayList<Integer>();
        printleft(root, 1, arr);
        return arr;
    }

    void printleft(Node root, int level, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        if (maxlevel < level) {
            arr.add(root.data);
            maxlevel = level;
        }
        printleft(root.left, level + 1, arr);
        printleft(root.right, level + 1, arr);

    }
}