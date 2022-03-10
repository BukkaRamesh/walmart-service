package com.sample.sridevi;

public class Performance {
	public static void main(String[] args) {
	
		
		StringBuilder str = new StringBuilder("Java");
		System.out.println(str);
		
		str.append("build");
		System.out.println(str);
		
		long t = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		
		for(int i=0;  i<100;i++ ); {
			str.append("Java Build");
			System.out.println(str);
		}
		System.out.println(System.currentTimeMillis() -t);
		System.out.println(System.currentTimeMillis() +t);
		
		
		StringBuffer buffer = new StringBuffer("Java");
		System.out.println(buffer);
		buffer.append("build");
		System.out.println(buffer);
		System.out.println(System.currentTimeMillis());

		for(int i=0;  i<100;i++ ); {
			buffer.append("Java Build");
			System.out.println(buffer);
			
		}
		System.out.println(System.currentTimeMillis() -t);
		System.out.println(System.currentTimeMillis() +t);
		
	}
	
	
	
	
	

	

}
