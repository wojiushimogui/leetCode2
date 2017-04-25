package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_5 {
	public List<Integer> grayCode(int n) {
        if(n<0) return new ArrayList<Integer>();
        if(n==0) {
        	List<Integer> l=new ArrayList<Integer>();
        	l.add(0);
        	return l;
        }
        //如果n>0,则直接利用递归来求解
        List<Integer> temp=grayCode(n-1);
        List<Integer> result=new ArrayList<Integer>(temp);
        int value=1<<(n-1);
        for(int i=temp.size()-1;i>=0;i--){
            result.add(value+temp.get(i));
        }
        return result;
        
        
    }
	public static void main(String[] args){
		Solution_5 s=new Solution_5();
		List<Integer> l=s.grayCode(4);
		for(Integer i:l){
			System.out.println(i +"  ");
		}
	}
}
