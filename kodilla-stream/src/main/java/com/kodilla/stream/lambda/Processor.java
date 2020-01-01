package com.kodilla.stream.lambda;

public class Processor {

    public void execute(Executor executor) {//argumentem jest obiekt klasy implementującej interfejs Executor.
        executor.process();
    }
}
