package leetcode.editor.cn;
//给定一个二叉树，返回它的 后序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [3,2,1] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 
// 👍 497 👎 0


import leetcode.editor.cn.utils.treeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePostorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
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
    List<Integer> orderList;
    public List<Integer> postorderTraversal(TreeNode root) {
        orderList=new ArrayList<>();
        recur(root);
        return orderList;
    }
    private void recur(TreeNode root){
        if(null == root) return;
        recur(root.left);
        recur(root.right);
        orderList.add(root.val);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
