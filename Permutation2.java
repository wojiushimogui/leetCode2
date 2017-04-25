package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
	ArrayList<String> res = new ArrayList<String>();
	public ArrayList<String> Permutation(String str) {
		if(str==null||str.length()==0){
			return res;
		}
		char[] ch = str.toCharArray();
	     helper(ch,0); 
	     return res;
    }

	private void helper(char[] ch, int start) {
		if(start==ch.length){
			res.add(new String(ch));
			return;
		}
		for(int i=start;i<ch.length;i++){
			//¿¼ÂÇÖØ¸´×Ö·û
			if(i!=start&&ch[i]==ch[start]){
				continue;
			}
			swap(ch,i,start);//ÅÅÐò
			helper(ch,start+1);
			swap(ch,i,start);
		}
	}

	private void swap(char[] ch, int index, int start) {
		char temp = ch[index];
		ch[index] =  ch[start];
		ch[start] = temp;
	}  
	
	public static void main(String [] args){
		Permutation2 p = new Permutation2();
		String str = "abc";
		
		List<String> res =p.Permutation(str);
		for(String s:res){
			System.out.println(s);
		}
	}
}
