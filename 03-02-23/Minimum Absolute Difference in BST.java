/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)
            return false;
        List<Integer> res = new ArrayList<>();
        inOrder(root,res);
        //Collections.sort(res);
        System.out.print(res);
        int low = 0;
        int high = res.size()-1;
        while(low<high){
            if(res.get(low)+res.get(high)<k){
                low++;
                }
            else if(res.get(low)+res.get(high)>k){
                high--;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public void inOrder(TreeNode root,List<Integer> res){
        if(root==null)
            return ;
        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);
    }
}
