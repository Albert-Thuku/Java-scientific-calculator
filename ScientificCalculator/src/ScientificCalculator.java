import java.lang.Math;

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
