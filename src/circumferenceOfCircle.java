package javaLearning;

import java.util.Scanner;

public class circumferenceOfCircle 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the values of pi and r");
		Scanner var = new Scanner(System.in);
		double pi = var.nextDouble();
		double r = var.nextDouble();
		double circumference = 2*pi*r;
		System.out.println("circumference of circle is "+circumference);
		var.close();
	}
}  