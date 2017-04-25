package com.wrh.leetcode;

import java.util.List;

public class Triangle_v1 {
	/*
	 * ����DP��������������
	 * */
	public int minimumTotal(List<List<Integer>> trgl) {
	    int sz = trgl.size();
	    int[] results = new int[sz+1];//�����������Ľ��

	    for(int i=sz-1; i>=0; i--) {
	        List<Integer> tmp = trgl.get(i);//�õ���i��list������i��

	        for(int j=0; j<tmp.size(); j++) {//�Ե�i����
	            results[j] = Math.min(results[j], results[j+1]) + tmp.get(j);
	        }
	    }
	    return results[0];
	}

}
