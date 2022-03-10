package com.sample.aashish;

public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		StringBuilder bu = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			bu.append("Hello World");
		}
		System.out.println(System.currentTimeMillis() - a);

		long b = System.currentTimeMillis();
		StringBuffer buff = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			buff.append("Hello World");
		}
		System.out.println(System.currentTimeMillis() - b);
	}
	}


// Explanation: However the Value keeps on changing on every run, String Builder seems to have faster performance 
// rate than the String Buffer. It is because String Builder is not syncronized whereas StringBuffer is Syncronized by which 
// eams When some thing is synchronized, then multiple threads can access, and modify it with out any problem or side effect.
