package com.kodilla.exception.test.zadanie2;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
       if(b == 0){
           throw new ArithmeticException();
       }
       return  a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0: " + e.toString());
        }  finally {
            System.out.println("Operation has not been completed");
        }
    }
}


