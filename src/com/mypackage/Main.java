package com.mypackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 5;

        //addition
        Add add = new Add();
        int sum=add.addition(a,b);
        System.out.println("Sum of a and b: "+sum);

        //subtraction
        Subtract sub = new Subtract();
        int dif=sub.subtraction(a,b);
        System.out.println("Difference of a and b: "+dif);

    }
}
