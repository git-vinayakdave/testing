package javaLearning;

import java.util.Scanner;

public class areaOfTriangle 
{
	public static void main(String[] args) 
	{
		Scanner var = new Scanner(System.in);
		int height = var.nextInt();
		int breath = var.nextInt();
		double area = 0.5 * height * breath;
		System.out.println("area of triangle is"+area);
		var.close();
		
	}

}
