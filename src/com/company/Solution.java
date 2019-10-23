package com.company;

import java.util.List;

public class Solution implements problem {
    @Override
    public int max(int x, int y) {
        if(x > y) return x;
        else    return y;
    }

    @Override
    public String reverse(String s) {
        String str = "";
        for(int i = s.length; i > 0; i--){
            str += str.charAt(i)
        }
        return str;
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
