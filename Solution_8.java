package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_8 {
	/*
	 *思路：借助两个队列来完成 
	 * */
	public List<List<Integer>> levelOrder(TreeNode root) {
	    Queue<TreeNode> q1=new LinkedList<TreeNode>(); 
	    Queue<TreeNode> tempQ=new LinkedList<TreeNode>();
	    List<List<Integer>> res=new ArrayList<List<Integer>>();
	    if(root==null){
	    	return res;
	    }
	    q1.add(root);
	    while(!q1.isEmpty()){
	    	List<Integer> list=new ArrayList<Integer>();
	    	while(!q1.isEmpty()){//取出这一层中所有结点的值
	    		TreeNode node=q1.remove();
		    	list.add(node.val);
		    	//将该结点的左右子节点放入另一个队列中
		    	if(node.left!=null){
		    		tempQ.add(node.left);
		    	}
		    	if(node.right!=null){
		    		tempQ.add(node.right);
		    	}
	    	}
	    	res.add(list);
	    	//将tempQ队列中的元素拷贝到q1队列中，供下次循环使用
	    	while(!tempQ.isEmpty()&&q1.isEmpty()){
	    		q1.add(tempQ.remove());
	    	}	    	
	    }
		return res;
	}
	
}
