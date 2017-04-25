package com.wrh.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsNearbyDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||k<1){
        	return false;
        }
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
        	if(hs.add(nums[i])==false){//当此元素重复的时候，就不能放入Set容器中
        		return true;
        	}
        	if(hs.size()==k+1){
        		hs.remove(nums[i-k]);//就是删除此时hs中的第一个元素。
        	}
        }
		return false;
    }
	/*
	 * 函数功能：如果数组中存在出现了两次及两次以上的数，则返回true，否则返回false
	 * */
	public static boolean containsDuplicate(int[] nums) {
        if(nums==null){
        	return false;
        }
        Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(set.add(nums[i])==false){
				return true;
			}
		}
		return false;
    }
	public static void main(String[] args){
		boolean flag=containsDuplicate(new int[]{3,1});
		System.out.println(flag);
	}
}
