package com.wrh.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String content = null;
		List<String> allContent=new ArrayList<String>();
        while((content = br.readLine()) != null){
            if(content.equals("n")){
            	break;
            }
            allContent.add(content);
        }
        //将allContent中的每个字符串用  空格分隔
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(String s:allContent){
        	String [] strArr=s.split(" ");
        	List<Integer> ls=new ArrayList<Integer>();
        	for(String s1:strArr){
        		if(!s1.isEmpty()){
        			ls.add(Integer.parseInt(s1));
        		}
        	}
        	list.add(ls);
        }
        //开始输出
        int len=list.size();
        int []visited=new int[len];
        for(int i=0;i<len;i++){
        	visited[i]=0;
        }
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<len;i++){ 
        	if(visited[i]==1){
    			continue;
    		}
        	List<Integer> tempList=list.get(i);
        	result.add(tempList);
        	for(int j=i+1;j<len;j++){//找出离第i个list最近有交集的list
        		if(visited[j]==1){
        			continue;
        		}
        		Set<Integer>  set=new HashSet<Integer>();
            	set.addAll(tempList);
        		set.addAll(list.get(j));
        		if(set.size()<tempList.size()+list.get(j).size()){
        			result.add(list.get(j));
        			visited[j]=1;//遍历过的并存储了的就标记下
        			tempList=list.get(j);
        		}
        	}
        }
        //输出
        for(List<Integer> temp:result){
        	System.out.println(temp);
        }
	}

}
