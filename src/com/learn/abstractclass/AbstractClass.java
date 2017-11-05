package com.learn.abstractclass;

/*
 * Creating the AbatractClass using the abstract keyword
 * Generally the abstract class have atleast one abstract method and atleast one non abstract method 
 */
public abstract class AbstractClass {

	/*
	 * This is the non abstract method
	 * In this method must have the definition/implementation
	 */
	public int calSuqare(int a)
	{
		System.out.println("SQUARE INPUT VALUE IS ::"+a);
		int square = a*a;
		System.out.println("SQUARE VALUE IS :: "+square);
		return square;
	}
	/*
	 * This is the abstract method
	 * In this method does not have the definition only the declaration 
	 */
	public abstract int calCube(int b);
	
	
}
