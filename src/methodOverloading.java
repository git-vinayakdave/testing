package javaLearning;

public class methodOverloading 
{
	void method1()
	{
		System.out.println("method1 no parameters and non static method ");
	}
	static void method2()
	{
		System.out.println("method2 no parameters and static method");
	}
	void addition(int a, int b) // here i have used integer , but we can use all the possible data types 
	{
		int sum = a + b;
		System.out.println("addition is done : "+ sum);
	}
	
	static void addition()
	{
		System.out.println("this static method is not parameterised and same name with overloaded method addition");
	}
  
	public static void main(String[] args) 
	{
		System.out.println("calling the methods ...");
		methodOverloading var1 = new methodOverloading(); // we require an object to call a non static method 
		var1.method1();
		
		method2(); // this is calling the static method , we do not need to declare any object for calling the static method  
		
		methodOverloading var2 = new methodOverloading(); // addition is performed and method overloading is done 
		var2.addition(56,23);
		
		addition(); // calling static method , which has same name as the method with non static and parameterized
	}

} 
