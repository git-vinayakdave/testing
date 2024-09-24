package javaLearning;

import java.util.Scanner;

public class areaOfSquare 
{
	public static void main(String[] args) 
	{
		Scanner v1 = new Scanner(System.in);
		System.out.println("Enter the side length");
		int side = v1.nextInt();
		int area = side * side;
		System.out.println("area of square is :"+area);
		v1.close();
	}

}
