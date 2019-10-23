package com.company;

import java.util.List;

public class Solution implements problem {
    @Override
    public int max(int x, int y) {

        if(x > y){
            return x;
        }

        else if(x < y){
            return y;
        }
        return 0;
    }

    @Override
    public String reverse(String s) {

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return sb.reverse().toString();

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
