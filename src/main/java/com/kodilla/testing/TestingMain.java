package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("TheForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("TheForumUser")) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();

        int result2 = calculator.add(5,2);

        int result3 = calculator.subtract(5,2);

        if (result2 == 7) {
            System.out.println("Test ok");
        }
        else {
            System.out.println("Error");
        }

        if (result3 == 3) {
            System.out.println("Test ok");
        }
        else {
            System.out.println("Error");
        }
    }
}
