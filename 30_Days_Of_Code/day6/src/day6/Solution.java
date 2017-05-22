package day6;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] strArray = new String[n];
		in.nextLine();
		for (int i = 0; i < n; i++) {
			strArray[i] = in.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < strArray[i].length(); k+=2) {
				System.out.print(strArray[i].charAt(k));
			}
			System.out.print(" ");
			for (int k = 1; k < strArray[i].length(); k+=2) {
				System.out.print(strArray[i].charAt(k));
			}
			System.out.println();
		}
	}

}
