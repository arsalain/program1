package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double num1;
	      double num2;
	      double ans;
	      char op;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter two numbers: ");
	      num1 = sc.nextDouble();
	      num2 = sc.nextDouble();
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      op = sc.next().charAt(0);
	      switch(op) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.print("\nThe result is given as follows:\n");
	      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	   }
	}
