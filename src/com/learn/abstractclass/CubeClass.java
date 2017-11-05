package com.learn.abstractclass;

/*
  * Here you extends the abstract class 
 */
public class CubeClass extends AbstractClass{
	
	/*
	 * Here you implement the abstract method
	 */
	public int calCube(int b) 
	{
		/*
		 * Here you use the non abstract method function in this
		 */
		int sq = calSuqare(b);
		int cube = sq*b;
		System.out.println("CUBE INPUT VALUE IS ::"+b);
		System.out.println("CUBE VALUE IS :: "+cube);
		return cube;
		
	}


}
