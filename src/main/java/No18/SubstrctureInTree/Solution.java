package No18.SubstrctureInTree;

/**
 * @author rancho
 * @date 2019/9/22
 */
public class Solution {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean hasSubTree(TreeNode source, TreeNode target) {
        if (source == null) {
            return false;
        }
        if (target == null) {
            return true;
        }
        if (doesSourceHaveTarget(source, target)) {
            return true;
        }
        return hasSubTree(source.left, target) || hasSubTree(source.right, target);
    }

    public static boolean doesSourceHaveTarget(TreeNode source, TreeNode target) {
        if (source == null && target == null) {
            return true;
        }
        if (source == null || target == null) {
            return false;
        }
        if (source.val != target.val) {
            return false;
        }
        // 递归校验当前root的左右子树
        return doesSourceHaveTarget(source.left, target.left) && doesSourceHaveTarget(source.right, target.left);
    }

}
