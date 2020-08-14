package com.kodilla.patterns.builder.checkers;

public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    Figure[][] figuresBoard = new Figure[10][];//powołuje 10 elementów

    public Board() {
        for (int n = 0; n < 10; n++) {
            figuresBoard[n] = new Figure[10];//inicjalizacja pustej planszy do
            // kazdego elementu stworzonego przypisuje 10 mu odpowiadających
        }
    }

    public Figure getFigure(int x, int y) {
        return figuresBoard[x][y];
    }

    public void setFigure(Figure figure, int x, int y) {
        figuresBoard[x][y] = figure;
    }


    public String toString() {
        String result = "";
        for (int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += "|";
            for (int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if (figuresBoard[n][k] == null) {
                    result += "";
                } else {
                    result += (figuresBoard[n][k]).getColor().equals(Figure.BLACK) ? "b" : "w";
                    result += (figuresBoard[n][k]) instanceof Pawn ? "P" : "Q";
                }
                result += "|";
            }
        }

        return result;
    }
/*
    public static void main(String[] args) {

        Board board = new Board();
        board.setFigure(new Figure(Figure.BLACK),2,4);
        board.getFigure(2,4);
*/
    }





