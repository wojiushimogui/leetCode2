package com.wrh.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LRUCache2 {
    private Map<Integer,Integer> map = null;
    private Map<Integer,Integer> counts = null;
    private int totalSize;
    public LRUCache2(int capacity) {
        map = new HashMap<Integer,Integer>(capacity);
        counts = new HashMap<Integer,Integer>(capacity);
        totalSize = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
        	upDateCount(key);      	
        	return map.get(key);
        }
        return -1;
    }
    
    private void upDateCount(int key) {
    	for(Integer k:counts.keySet()){
    		if(!k.equals(key)){
    			counts.put(k, counts.get(k)+1);// 对其他未使用的key进行加1操作
    		}
    	}
	}

	public void set(int key, int value) {
        if(map.size()<totalSize||(map.size()==totalSize&&map.containsKey(key))){
        	if(map.containsKey(key)){//存在
        		map.put(key, value);           	
        	}
        	else{//不存在
        		map.put(key, value);
        		counts.put(key, 0);
        	}
        	
        	
        }
        else if(map.size()==totalSize&&!map.containsKey(key)){
        	Set<Integer> set = counts.keySet();
        	int max = Integer.MIN_VALUE;
        	int keyInMaxCount = -1;
        	for(Integer k:set){
        		if(max<counts.get(k)){
        			max = counts.get(k);
        			keyInMaxCount = k;
        		}
        	}
        	map.remove(keyInMaxCount,map.get(keyInMaxCount));
        	counts.remove(keyInMaxCount, max);       	
        	map.put(key, value);
        	counts.put(key, 0);
        }
        //更新次数
        upDateCount(key);
    }
}
