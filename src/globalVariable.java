package javaLearning;
import java.util.Scanner;


public class globalVariable {

		Scanner sc=new Scanner(System.in);
		
		int a=			sc.nextInt();
		int b=			sc.nextInt();
		
			static void add()
			{
				
				globalVariable g1=new globalVariable();
				System.out.println("addition of two numbers");
				int sum=g1.a+g1.b;
				System.out.println(sum);
			}
			static void sub()
			{
				globalVariable g1=new globalVariable();
				System.out.println("subtraction of two numbers");
				int sub=g1.a-g1.b;
				System.out.println(sub);
			}
			static void multi()
			{
				globalVariable g1=new globalVariable();
				System.out.println("multiplication of two numbers");
				int mult=g1.a*g1.b;
				System.out.println(mult);
			}
			static void div()
			{
				globalVariable g1=new globalVariable();
				System.out.println("division of two numbers");
				int div=g1.a/g1.b;
				System.out.println(div);
			}
			static void mod()
			{
				globalVariable g1=new globalVariable();
				System.out.println("modulus of two numbers");
				int mod=g1.b%g1.a;
				System.out.println(mod);
			}

			
		public static void main(String[] args)
		{
			
			add();
			sub();
			multi();
			div();
			mod();
			

			}
			
	}