public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        var node = sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return check(nums, 0, nums.length - 1);
    }

    private static TreeNode check(int nums[], int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = check(nums, left, mid - 1);
        treeNode.right = check(nums, mid + 1, right);
        return treeNode;
    }
}
