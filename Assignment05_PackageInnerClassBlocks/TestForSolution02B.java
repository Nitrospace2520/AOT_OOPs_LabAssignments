package com.classesForSolution02.pTwo;

import com.classesForSolution02.pOne.TestForSolution02A;

public class TestForSolution02B extends TestForSolution02A {

    public TestForSolution02B(String brandName, String modelName, String[] features) {
        super(brandName, modelName, features);
    }

    public static void main(String[] args) {
        TestForSolution02B objectRef = new TestForSolution02B("Acer", "Aspire 7",
                new String[] { "Intel core i5", "nvidia geforce gtx", "Wifi-6" });
        System.out.println("Brand name: " + objectRef.brandName);
        System.out.println("Model name: " + objectRef.modelName);
        objectRef.getDetails();
    }
}