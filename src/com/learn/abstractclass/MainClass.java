package com.learn.abstractclass;

public class MainClass {

	public static void main(String[] args) {

		SquareClass sc = new SquareClass();
		int result = sc.calSuqare(5);
		System.out.println("SQUARE RESULT VALUE IS ::"+result);
		
		CubeClass cc = new CubeClass();
		int result1 = cc.calCube(10);
		System.out.println("CUBE RESULT VALUE IS ::"+result1);
	}

}
