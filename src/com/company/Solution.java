package com.company;

import java.util.List;

public class Solution implements problem {
    @Override
    public int max(int x, int y) {
    	if(x > y) {
    		return x;
    	}
    	else {
    		return y;
    	}
    }

    @Override
    public String reverse(String s) {
        return null;
    }

    @Override
    public float bestNumber() {
        return 0.000000000000001;
    }

    @Override
    public int sumDigits(int n) {
    	int sum = 0;
    	
    	for(int i = 0; i < n; i++) {
    		sum += i;
    	}
        return sum;
    }

    @Override
    public List reverseList(List l) {
    	List reverse = new ArrayList;
    	for(int i = l.size()-1; i >= 0; i--;) {
    		reverse.add(l.get(i));
    	}
        return reverse;
    }
}
