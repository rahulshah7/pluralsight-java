package com.pluralsightjava.calcengine;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    /*Setters*/

    public void setResult(double result) {this.result = result;}

    /*Getters*/

    public double getLeftVal() {return this.leftVal;}
    public double getRightVal() {return this.rightVal;}
    public double getResult() {return this.result;}

    /*Constructors*/

    public CalculateBase(){}

    public CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    /*Methods*/

    public abstract void calculate();
}
