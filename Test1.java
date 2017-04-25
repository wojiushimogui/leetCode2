package com.wrh.leetcode;

import java.util.Date;


public class Test1 extends Date{

	public static void main(String[] args) {
		new Test1().test();
	}
	private void test(){
		System.out.println(this.getClass().getName());
	}
}
