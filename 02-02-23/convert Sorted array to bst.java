class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return treeConstruct(0,nums.length-1,nums);

    }
    public TreeNode treeConstruct(int left,int right,int[] nums){
        if(left>right) return null;
        int mid = left+(right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = treeConstruct(left,mid-1,nums);
        node.right = treeConstruct(mid+1,right,nums);
        return node;
    }
}
