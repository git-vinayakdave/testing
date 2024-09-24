package javaLearning;

import java.util.Scanner;

public class areaOfRectangle 
{
	public static void main(String[] args)
	{
		Scanner v1 = new Scanner(System.in);
		System.out.println("Enter the length and breath of the rectangle");
		int length = v1.nextInt();
		int breath = v1.nextInt();
		int area = length * breath;
		System.out.println("area of the reactangle is :"+area);
		v1.close();
	}

}
