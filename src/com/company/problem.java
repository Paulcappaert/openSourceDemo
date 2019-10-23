package com.company;

import java.util.List;

public interface problem {

    /**
     * @param x
     * @param y
     * @return the max of x and y
     */
    int max(int x, int y);

    /**
     *
     * @param s
     * @return the reverse string of s
     */
    String reverse(String s);

    /**
     *
     * @return the best number
     */
    float bestNumber();

    /**
     *
     * @param n
     * @return
     */
    int sumDigits(int n);

    /**
     *
     * @param l
     * @return the reverse list of L
     */
    <T> List<T> reverseList(List<T> l);


}
