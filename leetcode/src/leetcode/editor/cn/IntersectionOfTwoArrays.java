package leetcode.editor.cn;
//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4] 
//
// 
//
// 说明： 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 304 👎 0


import leetcode.editor.cn.utils.listNode.ListNode;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
        solution.intersection(new int[]{1,2,2,1},new int[]{2,2});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numsSet = new HashSet();
        for (int i:nums1) numsSet.add(i);
        Set<Integer> intersectionSet =new HashSet();
        for(int i:nums2){
            if(numsSet.contains(i)) intersectionSet.add(i);
        }
        int length=intersectionSet.size();
        int[] result=new int[length];
        int index=0;
        for (int i:intersectionSet){
            result[index++]=i;
        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
