package com.pluralsightjava.calcengine;

public class Adder extends CalculateBase {

    /*Constructors*/

    public Adder(){}

    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    /*Methods*/

    @Override
    public void calculate(){
        setResult(getLeftVal() + getRightVal());
    }
}
