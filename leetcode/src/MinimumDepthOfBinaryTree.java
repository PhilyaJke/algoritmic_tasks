public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    public static int minDepth(TreeNode root) {
        return check(root);
    }

    public static int check(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = check(root.left);
        int right = check(root.right);
        if(left==0 && right!=0){
            return right+1;
        }else if(right==0 && left!=0){
            return left+1;
        }else if(right==0 && left==0){
            return 1;
        }else{
            return Math.min(left, right)+1;
        }
    }
}
