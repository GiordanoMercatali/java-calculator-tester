package org.lessons;

public class Calculator {

    private float num1;
    private float num2;

    public Calculator(float num1, float num2){
        this.num1 = 8;
        this.num2 = 2;
    }


    public float add(float n1, float n2){
        return n1+n2;
    }

    public float subtract(float n1, float n2){
        return n1-n2;
    }

    public float multiply(float n1, float n2){
        return n1*n2;
    }

    public float divide(float n1, float n2){
        return n1/n2;
    }
}
