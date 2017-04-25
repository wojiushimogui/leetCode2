package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRUCache {
    private Map<Integer,Integer> map = null;
    private List<Integer> list  = new ArrayList<Integer>();
    private int totalSize;
    public LRUCache(int capacity) {
        map = new HashMap<Integer,Integer>(capacity);
        totalSize = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){  
        	//��key������ǰ��
        	//����list��remove�����еĲ����������±�
        	remove(key); 	
        	list.add(0, key);
        	return map.get(key);
        }
        return -1;
    }
    

	public void set(int key, int value) {
		int mapSize = map.size();
		boolean b_Contain = map.containsKey(key);
        if(mapSize<totalSize&&!b_Contain){
        	map.put(key, value);
        }
        else if(mapSize<=totalSize&&b_Contain){
        	map.put(key, value);
        	//��key������ǰ��
        	remove(key);
        }
        else if(mapSize==totalSize&&!b_Contain){
        	Integer k = list.get(list.size()-1);
        	//����Map��ɾ�����û��ʹ�õ�
        	map.remove(k, map.get(k));
        	map.put(key, value);
        	//list.remove(k);
        	remove(k); 	
        }	
        //��key������ǰ��
        list.add(0, key);
    }

	private void remove(Integer k) {
		int len = list.size();
		for(int i=0;i<len;i++){
    		if(k.equals(list.get(i))){
    			list.remove(i);
    			break;
    		}
    	}
	}
}
