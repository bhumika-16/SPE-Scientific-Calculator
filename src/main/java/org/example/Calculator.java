package org.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, flag = 0;

        System.out.println("------------Calculator--------------");

        do {
            // Display the menu to the user
            displayMenu();

            // Prompt user for input
            System.out.print("Enter your choice: ");
            op = sc.nextInt();

            // Check if user chose to exit
            if (op == 9) {
                flag = 1;
            } else {
                performOperation(op, sc);
                if(op > 9)
                    flag=1;
            }
        } while (flag == 0);

        System.out.println("Exiting the calculator. Thank you!");
    }

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nChoices of Operations:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Factorial");
        System.out.println("7. Natural Log");
        System.out.println("8. Power");
        System.out.println("9. Exit");
        System.out.println();
    }

    // Method to perform the selected operation
    public static void performOperation(int operation, Scanner sc) {
        double num1, num2;

        switch (operation) {
            case 1: // Add
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                System.out.println("Result: " + add(num1, num2));
                break;

            case 2: // Subtract
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                System.out.println("Result: " + subtract(num1, num2));
                break;

            case 3: // Multiply
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                System.out.println("Result: " + multiply(num1, num2));
                break;

            case 4: // Divide
                System.out.print("Enter numerator: ");
                num1 = sc.nextDouble();
                System.out.print("Enter denominator: ");
                num2 = sc.nextDouble();
                System.out.println("Result: " + divide(num1, num2));
                break;

            case 5: // Square Root
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                System.out.println("Result: " + squareRoot(num1));
                break;

            case 6: // Factorial
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                System.out.println("Result: " + factorial((int) num1));
                break;

            case 7: // Natural Log
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                System.out.println("Result: " + naturalLog(num1));
                break;

            case 8: // Power
                System.out.print("Enter base: ");
                num1 = sc.nextDouble();
                System.out.print("Enter exponent: ");
                num2 = sc.nextDouble();
                System.out.println("Result: " + power(num1, num2));
                break;

            default:
                System.out.println("Exiting due to invalid input!!");
                break;
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero. Returning 0.0");
            return 0.0;
        }
    }

    public static double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Cannot calculate square root of a negative number. Returning 0.0");
            return 0.0;
        }
    }

    public static int factorial(int num) {
        if(num>=0) {
            int result = 1;
            for (int i = 1; i <= num; ++i) {
                result *= i;
            }
            return result;
        } else {
            System.out.println("Cannot calculate factorial of a negative number. Returning -1");
            return -1;
        }
    }

    public static double naturalLog(double num) {
        if (num > 0) {
            return Math.log(num);
        } else {
            System.out.println("Cannot calculate natural log of a non-positive number. Returning 0.0");
            return 0.0;
        }
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
