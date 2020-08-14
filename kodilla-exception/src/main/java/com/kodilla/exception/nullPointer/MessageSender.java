package com.kodilla.exception.nullPointer;

public class MessageSender {
    public void sendMessageTo(User user, String message) throws NullPointerException { //obsługa błędu uncheked (niewymagane obsłużenie)aby było wymagane trzeba dodac extends Exception
        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        } else {
            throw new NullPointerException("Object User was null");
        }

        //wyjątek wymaga obsłuzenia jak dziedziczy po exception.Trzeba go rzucić w metodzie przez throws i obsłużyć najpozniej w mainie
        //te co dziedziczą po runtime exception nie wymagają obsługiwanie (Null pointer exception)ale mozna je obsłuzyc samodzielnie
    }
}

