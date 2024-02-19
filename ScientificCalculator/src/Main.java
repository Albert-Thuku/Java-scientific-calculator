import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator App!");

        while (true) {
            System.out.println("Current Value: " + calculator.getCurrentValue());
            System.out.println("Enter an operator (+, -, *, /, sqrt, sin, cos, tan, ^, q to quit):");

            String operator = scanner.next();

            if (operator.equals("q")) {
                System.out.println("Thank you for using the Scientific Calculator App!");
                break;
            }

            switch (operator) {
                case "+":
                    System.out.println("Enter a number:");
                    calculator.add(scanner.nextDouble());
                    break;
                case "-":
                    System.out.println("Enter a number:");
                    calculator.subtract(scanner.nextDouble());
                    break;
                case "*":
                    System.out.println("Enter a number:");
                    calculator.multiply(scanner.nextDouble());
                    break;
                case "/":
                    System.out.println("Enter a number:");
                    calculator.divide(scanner.nextDouble());
                    break;
                case "sqrt":
                    calculator.squareRoot();
                    break;
                case "^":
                    System.out.println("Enter the exponent:");
                    calculator.exponent(scanner.nextDouble());
                    break;
                case "sin":
                    calculator.sine();
                    break;
                case "cos":
                    calculator.cosine();
                    break;
                case "tan":
                    calculator.tangent();
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
        }

        scanner.close();
    }
}
