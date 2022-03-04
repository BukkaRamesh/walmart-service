package com.sample.rameshpractise;
import java.io.*;

class Super
{
  void show() throws IOException { 
    System.out.println("parent class"); 
  }
}

public class Sub extends Super
{
  void show() throws IOException //ArrayIndexOutOfBoundsException                //Compile time error
  { 
    System.out.println("parent class"); 
  }

  public static void main(String[] args) throws IOException
  {
    Super s=new Sub();
    s.show();
  }
}


