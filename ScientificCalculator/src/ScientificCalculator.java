import java.lang.Math;
import java.util.Scanner;

public class ScientificCalculator {
    private double currentValue;

    public ScientificCalculator() {
        this.currentValue = 0.0;
    }

    public double getCurrentValue() {
        return this.currentValue;
    }

    public void setCurrentValue(double value) {
        this.currentValue = value;
    }

    public void add(double value) {
        this.currentValue += value;
    }

    public void subtract(double value) {
        this.currentValue -= value;
    }

    public void multiply(double value) {
        this.currentValue *= value;
    }

    public void divide(double value) {
        if (value != 0) {
            this.currentValue /= value;
        } else {
            System.out.println("Error: Division by zero");
        }
    }

    public void square() {
        this.currentValue = Math.pow(this.currentValue, 2);
    }

    public void squareRoot() {
        if (this.currentValue >= 0) {
            this.currentValue = Math.sqrt(this.currentValue);
        } else {
            System.out.println("Error: Cannot calculate square root of a negative number");
        }
    }

    public void exponent(double exponent) {
        this.currentValue = Math.pow(this.currentValue, exponent);
    }

    public void sine() {
        this.currentValue = Math.sin(Math.toRadians(this.currentValue));
    }

    public void cosine() {
        this.currentValue = Math.cos(Math.toRadians(this.currentValue));
    }

    public void tangent() {
        this.currentValue = Math.tan(Math.toRadians(this.currentValue));
    }

    // Add more scientific functions as needed
}

public class main {
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
