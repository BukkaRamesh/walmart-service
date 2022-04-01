package com.sample.aashish;

import java.util.Scanner;

public class Cashier implements Runnable  {
	
	 Wallmart objWallmart;
	 String name;

	
	public Cashier(Wallmart objWallmart, String name) {
		super();
		this.objWallmart = objWallmart;
		this.name = name;
	}


	@Override
	public void run() {
		
		Double[] price = new Double[5];
		String[] name = new String[5];
		
		for(int i=0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Price");
			price[i] = sc.nextDouble();
			System.out.println("Enter Name");
			name[i] = sc.next();
		}
		objWallmart.totalPrice(name, price);
		
	}

}
