package com.example.CoreJavaBasics.TypeCasting;

import java.util.Scanner;

public class TypeCastingMain {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

//        System.out.println("Input double");
//        double value = inputData.nextDouble();
//
//        System.out.println("Input integer");
//        int value1 = inputData.nextInt();
//
//        System.out.println("Input String");
//        String value2 = inputData.next();

        //        Type casting example

//        Narrow Type casting
        NarrowTypeCasting narrowTypeCasting = new NarrowTypeCasting();
        narrowTypeCasting.typeConverter(79.2);

//        Widening Type casting
        WideningTypeCasting wideningTypeCasting = new WideningTypeCasting();
        wideningTypeCasting.typeConverter(4445);

//        String to Int conversion
        StringToInt stringToInt = new StringToInt();
        stringToInt.typeConverter("95");

//        Int to string conversion
        IntToString intToString = new IntToString();
        intToString.typeConverter(889);
    }
}
