/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode build(int[] preorder, int preLeft, int preRight,
                                 int[] inorder, int inLeft, int inRight) {
        int leftSize = 0;
        if ((preRight - preLeft) != (inRight - inLeft)) {
            return null;
        }
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        if (preLeft == preRight) {
            return new TreeNode(preorder[preLeft]);
        }
        for (int i = inLeft; i <= inRight; i++) {
            if (inorder[i] == preorder[preLeft]) {
                leftSize = i - inLeft;
                break;
            }
        }
        TreeNode treeNode = new TreeNode(preorder[preLeft]);
        treeNode.left = build(preorder, preLeft + 1, preLeft + leftSize,
                inorder, inLeft, inLeft + leftSize - 1);
        treeNode.right = build(preorder, preLeft + leftSize + 1, preRight,
                inorder, inLeft + leftSize + 1, inRight);
        return treeNode;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }

        return build(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }
}