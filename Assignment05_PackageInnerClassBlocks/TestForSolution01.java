package com.classesForSolution01;

public class TestForSolution01 {
    private String name;
    String username;
    String password;

    public TestForSolution01(String username, String password) {
        this.username = username;
        this.password = password;
        this.name = null;
    }

    public String getName(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return this.name;
        }
        System.out.println("Please enter a valid input");
        return null;
    }

    public boolean setName(String username, String password, String name) {
        if (this.username.equals(username) && this.password.equals(password)) {
            this.name = name;
            System.out.println("Successfully updated");
            return true;
        }
        System.out.println("Please enter a valid input");
        return false;
    }
}
