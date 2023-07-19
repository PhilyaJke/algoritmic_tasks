public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(isBalanced(treeNode));
    }

    public static boolean isBalanced(TreeNode root) {
        if(root==null) {
            return true;
        }
        return check(root)!=-1;
    }

    public static int check(TreeNode treeNode){
        if (treeNode==null){
            return 0;
        }
        int left = check(treeNode.left);
        int right = check(treeNode.right);
        if(Math.abs(left-right)>1 || (left == -1 || right==-1))
            return -1;
        return Math.max(left, right)+1;
    }
}
