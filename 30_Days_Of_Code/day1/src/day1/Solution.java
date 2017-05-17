package day1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int x = 0;
        double y = 0;
        String s2 = "";
        
        x = scan.nextInt();
        scan.nextLine();
        y = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();
        
        x += i;
        y += d;
        String s3 = s.concat(s2);
        
        System.out.println(x + "\n" + y + "\n" + s3);
        
        scan.close();
    }
}
