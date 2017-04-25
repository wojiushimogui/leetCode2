package com.wrh.leetcode;

public class TestleftMove {

	private static final int MAXIMUM_CAPACITY = Integer.MAX_VALUE;
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
    
    
    public static void main(String[] args){
    	int cap = 11;
    	int res = tableSizeFor(cap);
    	
    	System.out.println(res);
    }
}
