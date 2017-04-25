package com.wrh.leetcode;

import java.math.BigDecimal;
import java.math.BigInteger;


public class TestStack{
	
	public static void main(String[] args){
		
		BigDecimal b = new BigDecimal("2");
		BigDecimal b2 = new BigDecimal("2147483647");
		BigDecimal b3 = new BigDecimal("2147483649");
		System.out.println(b3);
		System.out.println(b3.equals(b2.add(b)));	
		
	}
}
