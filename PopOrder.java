package com.wrh.leetcode;

import java.util.Stack;

public class PopOrder {
	
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	if(pushA==null||popA==null){
    		return false;
    	}
    	if(pushA.length!=popA.length){
    		return false;
    	}
        Stack<Integer> stack = new Stack<Integer>();
        int len = popA.length;
        int index=0;
        for(int i=0;i<len;i++){
        	while(stack.isEmpty()||!stack.peek().equals(popA[i])){
        		if(index==len){
        			return false;
        		}
        		stack.push(pushA[index++]);
        	}
        	
        	//如果相等，则pop
        	stack.pop();  	
        }
        return true;
    }
}
