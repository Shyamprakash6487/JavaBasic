package com.example.CoreJavaBasics;

import com.example.CoreJavaBasics.TypeCasting.NarrowTypeCasting;

import java.util.Scanner;

public class JavaCoreBasics {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        double value = inputData.nextDouble();

        //        Type casting example
        NarrowTypeCasting typeCasting = new NarrowTypeCasting();
        typeCasting.typeConverter(value);
    }

}
