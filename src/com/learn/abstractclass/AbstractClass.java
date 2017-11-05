package com.learn.abstractclass;

public abstract class AbstractClass {

	public int calSuqare(int a)
	{
		System.out.println("SQUARE INPUT VALUE IS ::"+a);
		int square = a*a;
		System.out.println("SQUARE VALUE IS :: "+square);
		return square;
	}
	public abstract int calCube(int b);
	
	
}
