/**
 * 
 */
package mvnSimpleProj;

import java.util.Scanner;

/**
 * @author Ron Greego
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void printResult(float result) {
		System.out.println("************************\nThe result is " + result);
	}
	
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n");
		int choice = scanner.nextInt();
		System.out.println("Enter the numbers\n");
		float num1 = scanner.nextFloat();
		float num2 = scanner.nextFloat();
		switch(choice) {
			case 1:
				printResult(addition(num1, num2));
				break;
			case 2:
				printResult(subtraction(num1, num2));
				break;
			case 3:
				printResult(division(num1, num2));
				break;
			case 4:
				printResult(multiplication(num1, num2));
				break;
			default:
				System.out.println("Invalid input");
				break;
		}
	}
	
	public static float addition(float num1, float num2) {
		return num1 + num2;
	}
	
	public static float subtraction(float num1, float num2) {
		return num1 - num2;
	}
	
	public static float multiplication(float num1, float num2) {
		return num1 * num2;
	}
	
	public static float division(float num1, float num2) {
		return num1 / num2;
	}

}
