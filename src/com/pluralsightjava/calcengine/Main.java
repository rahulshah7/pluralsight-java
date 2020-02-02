package com.pluralsightjava.calcengine;

public class Main {

    public static void main(String[] args) {

		MathEquation[] equations = new MathEquation[4];

		equations[0] = create(50.0d, 10.0d, 'a');
		equations[1] = create(25.0d, 5.0d, 's');
		equations[2] = create(50.0d, 10.0d, 'm');
		equations[3] = create(50.0d, 10.0d, 'd');

		for(MathEquation equation : equations){
			equation.execute();
			System.out.print("Result = ");
			System.out.println(equation.getResult());
		}
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
		MathEquation equation = new MathEquation();
		equation.setLeftVal(leftVal);
		equation.setRightVal(rightVal);
		equation.setOpCode(opCode);
		return equation;
	}
}
