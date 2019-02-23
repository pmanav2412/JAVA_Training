package com.marlabs.DateApi;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String s = "bvwcjfh wdvwdyvd whfvw wh fwdvwd dw whd";
		String[] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));
		System.out.println(s1.length);
		StringTokenizer str = new StringTokenizer(s, "w");
		System.out.println(str.countTokens());
		System.out.println("<<<<<<<FOR LOOP STARTS>>>>" + "\n");
		for (int i = 0; i < str.countTokens(); i++) {
			System.out.println(str.nextToken().trim());
			System.out.println(i);
		}

	}

}
