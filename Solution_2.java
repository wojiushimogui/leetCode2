package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_2 {
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates==null||candidates.length<1){
        	return null;
        }
        Arrays.sort(candidates);
        
        List<List<Integer>>  result =combination(candidates,target,0);
        //对返回的List<Integer>进行一个去重处理
        Set<List<Integer>> set=new HashSet<List<Integer>>();
        for(List<Integer> l:result){
        	set.add(l);
        }
        result.clear();
        for(List<Integer> l:set){
        	result.add(l);
        }
        
        return result;
		
    }

	private List<List<Integer>> combination(int[] candidates, int target, int start) {
		if(candidates==null||candidates.length<1){
        	return null;
        }
		List<List<Integer>>  result=new ArrayList<List<Integer>>();
		for(int i=start;i<candidates.length;i++){
			if(candidates[i]<target){
				for(List<Integer> res:combination(candidates,target-candidates[i],i+1)){
					res.add(0, candidates[i]);
					result.add(res);
				}
			}
			else if(candidates[i]==target){
				List<Integer> l=new ArrayList<Integer>();
				l.add(candidates[i]);
				result.add(l);
				return result;
				
			}
			else{
				break;
			}
		}
		return result;
	}
}
