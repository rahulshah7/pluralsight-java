package com.pluralsightjava.calcengine;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    double[] leftVals = {50.0d, 25.0d, 10.0d, 200.0d};
	    double[] rightVals = {10.0d, 5.0d, 10.0d, 1000.0d};
	    char[] opCodes = {'a','s','m','d'};
	    double[] results = new double[opCodes.length];

		for(int i = 0; i < opCodes.length; i++) {
			switch (opCodes[i]) {
				case 'a':
					results[i] = leftVals[i] + rightVals[i];
					break;
				case 's':
					results[i] = leftVals[i] - rightVals[i];
					break;
				case 'm':
					results[i] = leftVals[i] * rightVals[i];
					break;
				case 'd':
					results[i] = leftVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
					break;
				default:
					System.err.println("Invalid opCode");
					results[i] = 0.0d;
					break;
			}

		}
	    System.out.println(Arrays.toString(results));
    }
}
