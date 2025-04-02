package trees;

class Solution {
    public boolean checkTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }

        int sum = 0;
        if (root.left != null) {
            sum += root.left.val;
        }
        if (root.right != null) {
            sum += root.right.val;
        }

        return (root.val == sum && checkTree(root.left) && checkTree(root.right));

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10, new TreeNode(4, new TreeNode(2), new TreeNode(3)), new TreeNode(6));

        Solution sol = new Solution();
        System.out.println(sol.checkTree(root)); // Output: true
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}