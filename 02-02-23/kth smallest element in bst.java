class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        inOrder(root,res);
        return res.get(k-1);
    }
    public List<Integer> inOrder(TreeNode root,List<Integer>res){
        if(root==null)
            return res;
        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);
        return res;
    }
}
