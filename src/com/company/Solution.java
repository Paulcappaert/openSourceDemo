package com.company;

import java.util.List;

public class Solution implements problem {
    @Override
    public int max(int x, int y) {
        return Math.max(x, y);
    }

    @Override
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(s);
    	
    	return sb.reverse().toString();
    }

    @Override
    public float bestNumber() {
        return 42;
    }

    @Override
    public int sumDigits(int n) {
    	int retval = 0;
    	
    	int i = 1;
    	while(i <= n) {
    		retval += i;
    	}
    	
        return retval;
    }

    @Override
    public List reverseList(List l) {
        return null;
    }
}
