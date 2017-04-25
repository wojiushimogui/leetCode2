package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GetNGray {
	
	public List<List<Integer>> getGray(int n){	
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		if(n<1){
			return  res;
		}
		if(n==1){
			List<Integer> list0=new ArrayList<Integer>();
			List<Integer> list1=new ArrayList<Integer>();
			list0.add(0);
			list1.add(1);
			res.add(list0);
			res.add(list1);
			return res;
		}
		List<List<Integer>> tempRes=getGray(n-1);
		for(List<Integer> list:tempRes){
			List<Integer> newList=new ArrayList<Integer>();
			newList.addAll(list);
			newList.add(0, 0);
			res.add(newList);
		}
		for(int i=tempRes.size()-1;i>=0;i--){
			List<Integer> newList=new ArrayList<Integer>();
			newList.addAll(tempRes.get(i));
			newList.add(0, 1);
			res.add(newList);
		}
		return res;
	}
	public static void main(String[] args){
		GetNGray g=new GetNGray();
		int n=4;
		List<List<Integer>>res=g.getGray(n);
		for(List<Integer> list:res){
			System.out.println(list);
		}
	}
}
