package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_8 {
	/*
	 *˼·������������������� 
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
	    	while(!q1.isEmpty()){//ȡ����һ�������н���ֵ
	    		TreeNode node=q1.remove();
		    	list.add(node.val);
		    	//���ý��������ӽڵ������һ��������
		    	if(node.left!=null){
		    		tempQ.add(node.left);
		    	}
		    	if(node.right!=null){
		    		tempQ.add(node.right);
		    	}
	    	}
	    	res.add(list);
	    	//��tempQ�����е�Ԫ�ؿ�����q1�����У����´�ѭ��ʹ��
	    	while(!tempQ.isEmpty()&&q1.isEmpty()){
	    		q1.add(tempQ.remove());
	    	}	    	
	    }
		return res;
	}
	
}
