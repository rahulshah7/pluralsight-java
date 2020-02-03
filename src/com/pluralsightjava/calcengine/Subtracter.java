package com.pluralsightjava.calcengine;

public class Subtracter extends CalculateBase {

    /*Constructors*/

    public Subtracter(){}

    public Subtracter(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    /*Methods*/

    @Override
    public void calculate(){
        setResult(getLeftVal() - getRightVal());
    }
}
