package com.serenitydojo;

import org.junit.Test;

//Complete the tests in the WhenWorkingWithFloatingPointNumbers class, and make them pass:
//
//        Exercise 1 - Converting a number from celcius to farenheit
//        Exercise 2 - Convert kilograms to pounds

public class WhenWorkingWithFloatingPointNumbers {
    @Test
    public void case1(){
        int temperatureCel = 10;
        int weightTypeKg = 50;

        float fahrentheit = 33.8f;
        float pounds = 2.20462f;

        float conv2Fah = temperatureCel * fahrentheit;
        float conv2Pounds = weightTypeKg * pounds;

        System.out.println("the temperature is " + conv2Fah );
        System.out.println("the weight is " + conv2Pounds );
    }
}
