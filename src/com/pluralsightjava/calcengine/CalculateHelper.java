package com.pluralsightjava.calcengine;

public class CalculateHelper {

    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';


    private MathOperator operator;
    private double leftValue;
    private double rightValue;
    private double result;

    public void process(String statement) throws InvalidStatementException{
        String[] parts = statement.split(" ");
        if(parts.length != 3)
            throw new InvalidStatementException("Incorrect number of fields", statement);

        String operatorString = parts[0];

        try {
            leftValue = Double.parseDouble(parts[1]);
            rightValue = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            throw new InvalidStatementException("Non-numeric data", statement, e);
        }


        setOperatorFromString(operatorString);
        if (operator == null)
            throw new InvalidStatementException("Invalid operator", statement);

        CalculateBase calculation = null;

        switch (operator) {
            case Add:
                calculation = new Adder(leftValue, rightValue);
                break;
            case Subtract:
                calculation = new Subtracter(leftValue, rightValue);
                break;
            case Multiply:
                calculation = new Multiplier(leftValue, rightValue);
                break;
            case Divide:
                calculation = new Divider(leftValue, rightValue);
                break;
        }

        calculation.calculate();
        result = calculation.getResult();
    }

    private void setOperatorFromString(String operatorString) {
        if(operatorString.equalsIgnoreCase(MathOperator.Add.toString())) {
            operator = MathOperator.Add;
        }
        else if (operatorString.equalsIgnoreCase(MathOperator.Subtract.toString())) {
            operator = MathOperator.Subtract;
        }
        else if (operatorString.equalsIgnoreCase(MathOperator.Multiply.toString())) {
            operator = MathOperator.Multiply;
        }
        else if (operatorString.equalsIgnoreCase(MathOperator.Divide.toString())) {
            operator = MathOperator.Divide;
        }
    }
    @Override
    public String toString() {
        char operatorSymbol = ' ';
        switch (operator) {
            case Add:
                operatorSymbol = ADD_SYMBOL;
                break;
            case Subtract:
                operatorSymbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                operatorSymbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                operatorSymbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(40);
        sb.append(leftValue);
        sb.append(' ');
        sb.append(operatorSymbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }

}
