package com.pluralsightjava.app;

import com.pluralsightjava.calcengine.Adder;
import com.pluralsightjava.calcengine.CalculateBase;
import com.pluralsightjava.calcengine.CalculateHelper;
import com.pluralsightjava.calcengine.Divider;
import com.pluralsightjava.calcengine.InvalidStatementException;
import com.pluralsightjava.calcengine.MathEquation;
import com.pluralsightjava.calcengine.Multiplier;
import com.pluralsightjava.calcengine.Subtracter;

public class Main {

    public static void main(String[] args) {
//    	useMathEquation();
//    	useCalculateBase();

		String[] statements = {
			"add 2.0",
			"add two 3.0",
			"xyz 1.0 2.0",
			"add 50.0 5.0",
			"subtract 25.0 5.0",
			"multiply 50.0 10.0",
			"divide 50.0 10.0"
		};

		CalculateHelper helper = new CalculateHelper();
		for (String statement : statements) {
			try {
				helper.process(statement);
				System.out.println(helper.toString());
			}
			 catch (InvalidStatementException e) {
				System.err.println(e.getMessage());
				if (e.getCause() != null)
					System.err.println("\t Original exception: " + e.getCause().getMessage());
			}
		}
    }

    static void useMathEquation(){
		MathEquation[] equations = new MathEquation[4];

		equations[0] = new MathEquation('a', 50.0d, 10.0d);
		equations[1] = new MathEquation('s', 25.0d, 5.0d);
		equations[2] = new MathEquation('m', 50.0d, 10.0d);
		equations[3] = new MathEquation('d', 50.0d, 10.0d);

		for(MathEquation equation : equations) {
			equation.execute();
			System.out.print("Result = ");
			System.out.println(equation.getResult());
		}

		System.out.println();
		System.out.println("Using overloads:");
		System.out.println();

		MathEquation overloadedEquation = new MathEquation('d');

		double leftDouble = 9.0d;
		double rightDouble = 4.0d;

		int leftInt = 9;
		int rightInt = 4;

		overloadedEquation.execute(leftDouble, rightDouble);
		System.out.print("Result = ");
		System.out.println(overloadedEquation.getResult());

		overloadedEquation.execute(leftInt, rightInt);
		System.out.print("Result = ");
		System.out.println(overloadedEquation.getResult());

		overloadedEquation.execute((double)leftInt, rightInt);
		System.out.print("Result = ");
		System.out.println(overloadedEquation.getResult());
	}

	static void useCalculateBase() {
		System.out.println();
		System.out.println("Using inheritance:");
		System.out.println();

		CalculateBase[] calculations = {
				new Adder(5.0d, 2.0d),
				new Subtracter(10.0d, 2.0d),
				new Multiplier(25.0d, 2.0d),
				new Divider(15.0d, 2.0d),
		};

		for(CalculateBase calculation : calculations) {
			calculation.calculate();
			System.out.print("Result = ");
			System.out.println(calculation.getResult());
		}
	}
}
