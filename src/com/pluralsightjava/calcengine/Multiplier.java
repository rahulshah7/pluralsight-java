package com.pluralsightjava.calcengine;

public class Multiplier extends CalculateBase {

    /*Constructors*/

    public Multiplier(){}

    public Multiplier(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    /*Methods*/

    @Override
    public void calculate(){
        setResult(getLeftVal() * getRightVal());
    }
}
