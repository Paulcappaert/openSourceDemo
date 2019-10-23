package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    	Solution s = new Solution();
    	List<Character> a = new ArrayList<>();
    	List<Character> b = new ArrayList<>();
    	
    	for(int i = 0; i < 10; i++) {
    		a.add((char) ('a' + i));
    	}
    	
    	System.out.println("Max of 2 and 42 is: " + s.max(2, 42));
    	System.out.println("Reverse of 'Nathan Rossow is: '" + s.reverse("Nathan Rossow"));
    	System.out.println("Best Number is: " + s.bestNumber());
    	System.out.println("Sum of numbers to 42 is: " + s.sumDigits(42));
    	System.out.println("Reverse the list....");
    	
    	System.out.println("Original:");
    	System.out.println(Arrays.toString(a.toArray()));    	
    	System.out.println("Reversed");
    	b = s.reverseList(a);
    	System.out.println(Arrays.toString(b.toArray()));
    	
    }
}
