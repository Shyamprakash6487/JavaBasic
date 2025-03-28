package com.example.CoreJavaBasics.Arrays;

import java.util.Arrays;

public class ArrayBasic {

    public void printNum(int n){

    int[] numArray = new int[n];
    for(int i =0; i<n; i++){
        numArray[i] = n-i;
    }

//    for(int num : numArray){
//        System.out.println("Array elements are " + num);
//    }
        System.out.println("Int array " + Arrays.toString(numArray));


}

public void printString(int n){

        String[] words = new String[n];

        String w = "wa";

        for(int i =0; i <n; i++){

            words[i] = w;
            w = w +"a";

        }

        System.out.println("String array elements are " + Arrays.toString(words));
    }
}

