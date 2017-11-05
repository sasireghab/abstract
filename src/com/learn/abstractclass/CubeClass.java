package com.learn.abstractclass;

public class CubeClass extends AbstractClass{
	
	public int calCube(int b) 
	{
		int square = calSuqare(b);
		int cube = square*b;
		System.out.println("CUBE INPUT VALUE IS ::"+b);
		System.out.println("CUBE VALUE IS :: "+cube);
		return cube;
		
	}


}
