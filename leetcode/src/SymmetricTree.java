public class SymmetricTree {
    public static void main(String[] args) {
        System.out.println(isSymmetric(
                new TreeNode(1,
                        new TreeNode(2, new TreeNode(3) ,new TreeNode(4)),
                        new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        ));
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return check(root.right, root.left);
    }

    public static boolean check(TreeNode treeNode1, TreeNode treeNode2){
        if(treeNode1 == null && treeNode2 == null) {
            return true;
        }
        if (treeNode1 == null || treeNode2 == null){
            return false;
        }
        if(treeNode1.val != treeNode2.val){
            return false;
        }

        return treeNode1.val== treeNode2.val && check(treeNode1.left, treeNode2.right) && check(treeNode1.right, treeNode2.left);
    }
}
