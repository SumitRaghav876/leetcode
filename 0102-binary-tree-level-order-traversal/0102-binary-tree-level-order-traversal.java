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
    public void solve(TreeNode root, List<List<Integer>>ans,int level){
        if(root==null){
            return;
        }
        if(level==ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        solve(root.left,ans,level+1);
        solve(root.right,ans,level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(root,ans,0);
        return ans;
    }
}