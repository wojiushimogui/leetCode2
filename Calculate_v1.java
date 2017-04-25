package com.wrh.leetcode;

import java.util.Stack;

public class Calculate_v1 {
	
	public int calculate(String s) {
		if(s==null){
			return -1;
		}
		int len=s.length();
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Character> stack_sign=new Stack<Character>();
		for(int i=0;i<len;i++){
			char ch=s.charAt(i);
			if(Character.isDigit(ch)){
				int num=ch-'0';
				while(i+1<len&&Character.isDigit(s.charAt(i+1))){
					num*=10+s.charAt(i+1)-'0';
					i++;
				}
				stack.push(num);
			}
			else if(ch==' '){
				continue;
			}
			else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
				stack_sign.push(ch);
			}
		}
		while(stack.size()>1&&!stack_sign.isEmpty()){
			int secondValue=stack.pop();
			int firstValue=stack.pop();
			char ch=stack_sign.pop();
			switch(ch){
				case '+':stack.push(firstValue+secondValue);
						break;
				case '-':stack.push(firstValue-secondValue);
					break;
				case '*':stack.push(firstValue*secondValue);
					break;
				case '/':stack.push(firstValue/secondValue);
					break;
			}
		}
		return stack.pop();
    }
}
