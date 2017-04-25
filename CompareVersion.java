package com.wrh.leetcode;

public class CompareVersion {
	public static int compareVersion(String version1, String version2) {
        String[] str1=version1.split("\\.");
        String[] str2=version2.split("\\.");
        int len1=str1.length;
        int len2=str2.length;
        for(int i=0;i<min(len1,len2);i++){
        	if(Integer.parseInt(str1[i])<Integer.parseInt(str2[i])){
        		return -1;
        	}
        	else if(Integer.parseInt(str1[i])>Integer.parseInt(str2[i])){
        		return 1;
        	}
        }
        if(len1>len2){//检查str1 后面的字符串是否全为 0
        	for(int j=len2;j<len1;j++){
        		if(Integer.parseInt(str1[j])!=0){
        			return 1;
        		}
        	}
        }
        else if(len1<len2){
        	for(int j=len1;j<len2;j++){
        		if(Integer.parseInt(str2[j])!=0){
        			return -1;
        		}
        	}
        }
        return 0;     		
    }
	private static int min(int a,int b){
		return (a<b)?a:b;
	}
	public static void main(String[] args){
		String version1="1.1";
		String version2="1.1.000";
		int res=compareVersion(version1,version2);
		System.out.println(res);
	}
}
