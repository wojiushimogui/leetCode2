package com.wrh.leetcode;

import java.util.List;

public class Triangle_v1 {
	/*
	 * 利用DP来从下往上来做
	 * */
	public int minimumTotal(List<List<Integer>> trgl) {
	    int sz = trgl.size();
	    int[] results = new int[sz+1];//用来保存最后的结果

	    for(int i=sz-1; i>=0; i--) {
	        List<Integer> tmp = trgl.get(i);//得到第i个list，即第i行

	        for(int j=0; j<tmp.size(); j++) {//对第i进行
	            results[j] = Math.min(results[j], results[j+1]) + tmp.get(j);
	        }
	    }
	    return results[0];
	}

}
