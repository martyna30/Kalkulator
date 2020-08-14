package com.kodilla.exception.nullPointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();

        try {
        messageSender.sendMessageTo(user, "Hello!");
        } catch (NullPointerException e) {
            System.out.println("Message is not send" +
                    "but my program still running very well!");
        }

        System.out.println("Processing other logic!");
    }
}
