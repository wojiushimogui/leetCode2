package com.wrh.leetcode;

public class Test {
	public static void main(String[] args){
		Test t=new Test();
		int i=0;
		t.foo(i);
		i=i++;
		System.out.println(i);
	}

	private void foo(int i) {
		i++;
	}
}
