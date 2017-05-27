package day10;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder = 0;
        int counter = 0;
        int numConsecutiveOnes = 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        while (n > 0) {
        	remainder = n % 2;
        	n = n / 2;
        	stack.push(remainder);
        }
        
        while (!stack.empty())
        {
        	if (stack.peek() == 1) {
        		counter++;
        	} else {
        		counter = 0;
        	}
        	if (counter > numConsecutiveOnes)
    			numConsecutiveOnes = counter;
            stack.pop();
        }
        System.out.println(numConsecutiveOnes);
    }
}
