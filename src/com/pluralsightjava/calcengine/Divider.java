package com.pluralsightjava.calcengine;

public class Divider extends CalculateBase {

    /*Constructors*/

    public Divider(){}

    public Divider(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    /*Methods*/

    @Override
    public void calculate(){
        setResult(getLeftVal() / getRightVal());
    }
}
