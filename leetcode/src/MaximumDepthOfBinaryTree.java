public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
//        TreeNode treeNode = new TreeNode(
//                1, null, new TreeNode(2)
//        );
        System.out.println(maxDepth(treeNode));
    }
    public static int maxDepth(TreeNode root) {
        int count = 0;
        if(root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        count = Math.max(left,right) + 1;
        return count;
    }

}

//left - 1
