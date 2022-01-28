package LearningMethod;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for num1");
		int num1 = sc.nextInt();
		System.out.println("Enter value for num2");
		int num2 = sc.nextInt();
		// Using Scanner value for method with argument only

		// To use any class & it's method, we need an object of it
		// Syntax of creating an object:ClassName &ClassVariable name
		// Here-we are using the object to call method
		Substraction substraction = new Substraction();
		substraction.subtractTwoNumbers();
		Addition addition = new Addition();
		addition.addTwoNumbers();
//Adding two number using method with arguments
		MethodWithArguments methodWithArgument = new MethodWithArguments();
		// Here-Calling the method& passing value in method
		methodWithArgument.subtractTwoNumbers(num1, num2);// we can value here anytime
	}

}
