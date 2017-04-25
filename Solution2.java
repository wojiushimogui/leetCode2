package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	helper(new ArrayList<Integer>(),root,target);
        return res;
    }
	private void helper(ArrayList<Integer> tempRes,
			TreeNode root, int target) {
		if(root==null){
			return;
		}
		if(root.left==null&&root.right==null){
			if(root.val==target){
				tempRes.add(root.val);
				res.add(tempRes);
			}
			return ;
		}
		tempRes.add(root.val);
		if(root.left!=null){
			helper(new ArrayList(tempRes),root.left,target-root.val);
		}
		
		if(root.right!=null){
			helper(new ArrayList(tempRes),root.right,target-root.val);
		}
		
	}
	
}