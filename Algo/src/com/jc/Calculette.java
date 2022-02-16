package com.jc;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculette {
	static Scanner sc;

	final static String		numberRegex = "[0-9]+(\\.[0-9]+)?";
	final static String		operatorRegex = "[\\+\\-\\/\\*%]";
	final static String		operationRegex = String.format("^%s%s%s$", numberRegex, operatorRegex, numberRegex);
	final static String		specialRegex = "[cCqQ]";
	

	final static Pattern		patternNumber = Pattern.compile(numberRegex);
	final static Pattern		patternOperator = Pattern.compile(operatorRegex);
	final static Pattern		patternOperation = Pattern.compile(operationRegex);
	final static Pattern		patternSpecial = Pattern.compile(specialRegex);
	
	public static double add(Double a, Double b) {
		System.out.println("The result of " + a + " + " + b + " is " + (a + b));
		return (a + b);
	}
	
	public static double sub(Double a, Double b) {
		System.out.println("The result of " + a + " - " + b + " is " + (a - b));
		return (a - b);
	}
	
	public static double mul(Double a, Double b) {
		System.out.println("The result of " + a + " * " + b + " is " + (a * b));
		return (a * b);
	}
	
	public static double div(Double a, Double b) {
		if (b == 0) {
			System.out.println("I don't know how to divide by 0");
			return (0);
		}
		System.out.println("The result of " + a + " / " + b + " is " + (a / b));
		return (a / b);
	}
	
	public static double mod(Double a, Double b) {
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
	
	public static String	prompt(Double currentValue, boolean isInitialized) {
		String	showablePrompt;
		String	userInput;
		
		showablePrompt = String.format("[%f]>", currentValue);
		System.out.print(showablePrompt);
		if (isInitialized)
			System.out.print(currentValue.toString());
		userInput = sc.next();
		
		return userInput;
	}
	
	public static Double	parseInput(Boolean isInitialised, Double ans, String input) {
		String		left;
		String		right;
		String		operator;
		
		Matcher		matcher;

		matcher = patternSpecial.matcher(input);
		if (matcher.find()) {
			operator = input.substring(matcher.start(), matcher.end());
			return calculate(ans, 0.0, operator.charAt(0));
		}
		if (isInitialised)
			input = ans.toString() + input;
		matcher = patternOperation.matcher(input);
		if (matcher.find()) {
    		matcher = patternNumber.matcher(input);
			left = (matcher.find()) ? input.substring(matcher.start(), matcher.end()) : null;
			right = (matcher.find()) ? input.substring(matcher.start(), matcher.end()) : null;

			matcher = patternOperator.matcher(input);
			operator = (matcher.find()) ? input.substring(matcher.start(), matcher.end()) : null;
    		
    		ans = calculate(Double.parseDouble(left), Double.parseDouble(right), operator.charAt(0));
        }
		return ans;
	}
	
	public static Double	calculate(Double a, Double b, char op) {
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
			case 'Q', 'q':
				System.out.println("Terminating calculator");
				sc.close();
				System.exit(0);
				break;
			case 'C', 'c':
				System.out.println("Reinitializing");
				a = 0.0;
				break;
			default:
				System.out.println("Science has not gone there yet.");
				break;
		}
		return a;
	}
	
	public static void calculator() {
		Double	ans;
		String	userInput;
		Boolean	calculating;
		
		calculating = false;
		ans = 0.0;
		sc.useLocale(Locale.US);
		calculatorUsage();
		do {
			try {
				userInput = prompt(ans, calculating);
				ans = parseInput(calculating, ans, userInput);
				System.out.println(calculating);
				calculating = true;
			} catch (Exception e) {
				e.printStackTrace();
				sc.close();
				sc = new Scanner(System.in);
			}
		} while (calculating);
	}
	
	public static void simpleCalculator() {
		
		// EXERCICE Calculette V1, 2, 3
		
		double	a;
		double	b;
		char	op;
		boolean	calculating;
		String	input;
		
		System.out.println("Usage : Enter a number, an operator and a second number. Ex: '12' '+12'");
		System.out.println("You can iterate on the result with another operator or number.");
		System.out.println("Use 'C' to clean your answer and 'S' to quit.");


		sc.useLocale(Locale.US);
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
						System.err.println("Unknown operation type.");
						break;
				}
				System.out.println("Current answer : " + a);
			}
		} catch (Exception e) {
			System.out.println("Please learn to input actual numbers.");
		}
		
		sc.close();
	}
	

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		calculator();
	}
}
