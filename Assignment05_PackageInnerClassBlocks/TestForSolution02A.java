package com.classesForSolution02.pOne;

public class TestForSolution02A {

    public String brandName;
    public String modelName;
    public String[] features;

    public TestForSolution02A(String brandName, String modelName, String[] features) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.features = features;
    }

    public void getDetails() {
        String temp = "";
        for (String string : features) {
            temp += string + ", ";
        }
        temp += "etc";
        System.out.println("Brand name: " + brandName + ", Model name: " + modelName + ", some features are : "
                + temp);
    }
}