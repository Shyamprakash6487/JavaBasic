package com.example.CoreJavaBasics.StringOperations;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringBasic {
    public void StringDemo(){

        //Basic String
        String sample = "String Demo started";
//        String sample = new String("String Demo started");

        //If two variables have the same string value the value will be retrieved from a simple memory space.

        String sample01 = "String Demo started";

        //Java text blocks
        String textBlock = """
                This is a java text block.
                """;
        String textBlock1 = """
                    This is to demo the spacing effect of the text block
                """;

        //Concat String

        String concatExm = sample01 + " " + sample;
        //What is actually happening
        //String concatExm = new StringBuilder(sample01).append(sample).toString();


//        When iterating a string value every time a new StringBuilder() is instance is created
//        Along with the increased string size the code will run slow. So to tackle this we will
//        created a instance outside the loop and use that.

        String newString = "Loop demo";
        StringBuilder stringB = new StringBuilder();

        String[] strings = new String[]{"one"," ", "two"," ", "three"," ", "four"};

        for(String string : strings){
            stringB.append(string);

        }
        String result = stringB.toString();


        System.out.println(sample);
        System.out.println(sample01);
        System.out.println(textBlock);
        System.out.println(textBlock1);
        System.out.println(newString);
        System.out.println(result);
        System.out.println(concatExm);
        System.out.println(result.length());
    }
}
