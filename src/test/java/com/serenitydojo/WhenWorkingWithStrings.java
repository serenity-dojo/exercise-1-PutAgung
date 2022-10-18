package com.serenitydojo;

import org.junit.Test;

import java.util.Locale;

public class WhenWorkingWithStrings {

    @Test
    public void excercises(){
        String name = "Putra Agung Pratama   ";

        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);

        String upperCase = name.toUpperCase();
        System.out.println(upperCase);

        String trimExtraSpc = name.trim();
        System.out.println(trimExtraSpc);

        System.out.println(upperCase.length());

        String replaceName = name.replace("Putra Agung Pratama   ","Putra Pratama");
        System.out.println(replaceName);
    }
}
