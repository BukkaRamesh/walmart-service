package com.sample.srr;

//Inheritance
public class Human {
		void eat(){System.out.println("eating...");}  
		}  
		class Mother extends Human{  
		void talk(){System.out.println("talking...");}  
		}  
		class Baby extends Mother{  
		void cry(){System.out.println("crying...");}  
		}  
		class TestInheritance2{  
		public static void main(String args[]){  
			
		Baby d=new Baby();  
		d.cry();  
		d.talk();  
		d.eat();  
		}
		}  
		
		

