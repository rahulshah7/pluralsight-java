package com.pluralsightjava.calcengine;

public class Main {

    public static void main(String[] args) {

		MathEquation[] equations = new MathEquation[4];

		equations[0] = new MathEquation('a', 50.0d, 10.0d);
		equations[1] = new MathEquation('s', 25.0d, 5.0d);
		equations[2] = new MathEquation('m', 50.0d, 10.0d);
		equations[3] = new MathEquation('d', 50.0d, 10.0d);

		for(MathEquation equation : equations){
			equation.execute();
			System.out.print("Result = ");
			System.out.println(equation.getResult());
		}

		System.out.println();
		System.out.println("Using overloads:");
		System.out.println();

		MathEquation overloadedEquation = new MathEquation('a');
		overloadedEquation.execute(48.0, 52.0);
		System.out.print("Result = ");
		System.out.println(overloadedEquation.getResult());
    }
}
