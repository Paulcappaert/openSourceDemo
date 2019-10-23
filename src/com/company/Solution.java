package com.company;

import java.util.List;

public class Solution implements problem {
    @Override
    public int max(int x, int y) {
    	if(x>y) {
    		return x;
    	}
        return y;
    }

    @Override
    public String reverse(String s) {
    	String a = "";
    	for(int i=s.length()-1;i>=0;i--) {
    		a+=s.charAt(i);
    	}
        return a;
    }

    @Override
    public float bestNumber() {
        return 0;
    }

    @Override
    public int sumDigits(int n) {
        return 0;
    }

    @Override
    public List reverseList(List l) {
        return null;
    }
}
