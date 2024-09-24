package javaLearning;

import java.util.Scanner;

public class areaOfCircle_withScannerClass
{

	public static void main(String[] args) 
	{
		System.out.println("enter the values");
		Scanner v1 = new Scanner(System.in);
		double pi = v1.nextDouble();
		double r = v1.nextDouble();
		double areaCircle = pi*r*r;
		System.out.println("area of the circle is :"+areaCircle);
		v1.close();
	}

}
