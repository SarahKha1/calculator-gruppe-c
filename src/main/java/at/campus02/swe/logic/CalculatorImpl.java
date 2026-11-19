package at.campus02.swe.logic;


import at.campus02.swe.Calculator;
import at.campus02.swe.CalculatorException;

import java.util.Stack;

public class CalculatorImpl implements Calculator {

    private Stack<Double> stack_ = new Stack<Double>();

    @Override
    public double perform(Operation op) throws CalculatorException {
        if (op == Operation.dotproduct) {
            return performDotProduct();
        }

        double b = pop();
        double a = pop();

        switch (op) {
            case add:
                return a + b;
            case sub:
                return a - b;
            case div:
                double c = a / b;
                if (Double.isInfinite(c))
                    throw new CalculatorException("Division by zero");
                return c;
            case mul:
                return a * b;

            case mod:
                if (b==0)
                    throw new CalculatorException("Modulo by zero");
                return a % b;
        }
        return 0;
    }

    @Override
    public double pop() throws CalculatorException {
        if (stack_.isEmpty())
            throw new CalculatorException();
        return stack_.pop();
    }

    @Override
    public void push(double v) {
        stack_.push(v);
    }

    @Override
    public void clear() {
        stack_.clear();
    }

    private double performDotProduct() throws CalculatorException {
        double rawLength = pop();

        if (!Double.isFinite(rawLength)
                || rawLength <= 0
                || rawLength != Math.floor(rawLength)) {
            throw new CalculatorException(
                    "Vector length must be a positive integer.");
        }

        if (rawLength > stack_.size() / 2) {
            throw new CalculatorException(
                    "Not enough values on the stack for two vectors.");
        }

        int length = (int) rawLength;
        double[] secondVector = new double[length];

        for (int i = length - 1; i >= 0; i--) {
            secondVector[i] = pop();
        }

        double result = 0.0;
        for (int i = length - 1; i >= 0; i--) {
            result += pop() * secondVector[i];
        }

        return result;
    }

}
