package com.jc;

import java.util.Locale;
import java.util.Scanner;

public class Calculette {
	
	public static double add(double a, double b) {
		System.out.println("The result of " + a + " + " + b + " is " + (a + b));
		return (a + b);
	}
	
	public static double sub(double a, double b) {
		System.out.println("The result of " + a + " - " + b + " is " + (a - b));
		return (a - b);
	}
	
	public static double mul(double a, double b) {
		System.out.println("The result of " + a + " * " + b + " is " + (a * b));
		return (a * b);
	}
	
	public static double div(double a, double b) {
		if (b == 0) {
			System.out.println("I don't know how to divide by 0");
			return (0);
		}
		System.out.println("The result of " + a + " / " + b + " is " + (a / b));
		return (a / b);
	}
	
	public static double mod(double a, double b) {
		if (b == 0) {
			System.out.println("I don't know how to divide by 0");
			return (0);
		}
		System.out.println("The result of " + a + " % " + b + " is " + (a % b));
		return (a % b);
	}
	
	public static void		calculatorUsage() {
		System.out.println("Usage : Enter a number, an operator and a second number.");
		System.out.println("You can iterate on the result with another operator and number.");
		System.out.println("Use 'C' to clean your answer and 'S' to quit.");
	}
	
	public static String	prompt(Double currentValue) {
		Scanner	sc;
		String	showablePrompt;
		String	userInput;
		
		sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		showablePrompt = String.format("[%f]>", currentValue);
		System.out.print(showablePrompt);
		userInput = sc.nextLine();
		sc.close();
		
		return userInput;
	}
	
	public static double	parseInput(Boolean isInitialised, Double ans, String input) {
		return(ans);
	}
	
	public static double	calculate(Double a, Double b, char op) {
		switch (op) {
			case '+':
				a = add(a, b);
				break;
			case '-':
				a = sub(a, b);
				break;
			case '*':
				a = mul(a, b);
				break;
			case '/':
				a = div(a, b);
				break;
			case '%':
				a = mod(a, b);
				break;
			default:
				System.out.println("Science has not gone there yet.");
				break;
		}
		return(a);
	}
	
	public static void calculator() {
		Double	ans;
		String	userInput;
		boolean	calculating;
		
		calculating = true;
		ans = 0.0;
		calculatorUsage();
		do {
			userInput = prompt(ans); 
			System.out.println("Your entry is " + userInput);
			calculating = false;
		} while (calculating);
	}
	
	public static void main(String[] args) {
		
		// EXERCICE Calculette V1, 2, 3
		
		
		Scanner sc = new Scanner(System.in);
		double	a;
		double	b;
		char	op;
		boolean	calculating;
		String	input;
		
		System.out.println("Usage : Enter a number, an operator and a second number.");
		System.out.println("You can iterate on the result with another operator or number.");
		System.out.println("Use 'C' to clean your answer and 'S' to quit.");

		
		calculating = true;
		try {
			a = sc.nextDouble();
			
			while (calculating) {
				input = sc.next();
				if (input.contains("C")) {
					op = 'C';
				}
				op = input.charAt(0);
				if (op == 'C') {
					a = 0;
					System.out.println("Reintialising value.");
					continue;
				} else if (op == 'S') {
					calculating = false;
					System.out.println("Thank you for using our stuff. Your final value is " + a);
					break;
				}
				b = Double.parseDouble(input.substring(1));
				switch (op) {
					case '+':
						a = add(a, b);
						break;
					case '-':
						a = sub(a, b);
						break;
					case '*':
						a = mul(a, b);
						break;
					case '/':
						a = div(a, b);
						break;
					case '%':
						a = mod(a, b);
						break;
					default:
						System.out.println("Unknown operation type.");
						break;
				}
				System.out.println("Current answer : " + a);
			}
		} catch (Exception e) {
			System.out.println("Please learn to input actual numbers.");
		}
		
		sc.close();
	}
}
