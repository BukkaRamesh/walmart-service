package com.sample.aashish;

public class A {
	
	public void display() {
		System.out.println("hello there i am class A");
	}
	
public class B extends A{
	public void displayB() {
		System.out.println("I am class B extending A");
	}
	
}
public class C extends A{
	public void displayC() {
		System.out.println("I am class C extending A");
	}

}
public class D extends B,C{
	public void displayD() {
		System.out.println("I am class D extending B and C");
	}
}

	public static void main(String[] args) {
		//creating object of A and calling the function
		A a = new A();
		a.display();
		
		//creating object of B and calling method of class B and class A since we extend class A
		B b = new B();
		b.displayB();
		b.display();
		
		C c = new C();
		c.displayC(); // display method from class C
		c.display(); // displaying method of Class A.

	}

}

// Note: Multiple Inheritance is impossible in java because of Ambiguity problem . 
