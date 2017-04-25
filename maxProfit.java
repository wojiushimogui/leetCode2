package com.wrh.leetcode;

public class maxProfit {
	public int maxProfit(int[] prices) {
	    // these four variables represent your profit after executing corresponding transaction
	    // in the beginning, your profit is 0. 
	    // when you buy a stock ,the profit will be deducted of the price of stock.
	    int firstBuy = Integer.MIN_VALUE, firstSell = 0;
	    int secondBuy = Integer.MIN_VALUE, secondSell = 0;

	    for (int curPrice : prices) {
	        if (firstBuy < -curPrice) firstBuy = -curPrice; // the max profit after you buy first stock
	        if (firstSell < firstBuy + curPrice) firstSell = firstBuy + curPrice; // the max profit after you sell it
	        if (secondBuy < firstSell - curPrice) secondBuy = firstSell - curPrice; // the max profit after you buy the second stock
	        if (secondSell < secondBuy + curPrice) secondSell = secondBuy + curPrice; // the max profit after you sell the second stock
	    }

	    return secondSell; // secondSell will be the max profit after passing the prices
	}
}
