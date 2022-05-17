package com.chris.leetcode.dfs.topic617;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/17
 * @描述 合并二叉树
 */
public class MergeTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(3);
        TreeNode root3 = new TreeNode(2);
        TreeNode root4 = new TreeNode(5);
        TreeNode root5 = new TreeNode(2);
        TreeNode root6 = new TreeNode(1);
        TreeNode root7 = new TreeNode(3);
        TreeNode root8 = new TreeNode(4);
        TreeNode root9 = new TreeNode(7);
        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;
        root4.left = root8;
        root4.right = root9;
        TreeNode root = mergeTrees(root1, root3);
        System.out.println(root);
    }

    public static class TreeNode {
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

    private static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode merged = new TreeNode(root1.val + root2.val);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        return merged;
    }
}
