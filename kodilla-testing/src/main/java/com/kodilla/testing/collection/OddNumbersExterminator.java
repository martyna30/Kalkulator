package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    ArrayList<Integer> listEven = new ArrayList<>();

    public void exterminate(ArrayList<Integer> numbers) {
        for (int count : numbers) {
            if (count % 2 == 0) {
                listEven.add(count);
            }
        }
    }
    public boolean isEven(int count){
        if(count % 2 == 0) {

        }
        return true;
    }

    public ArrayList<Integer> getListEven() {
        return listEven;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(50);
            list.add(number);
        }

        oddNumbersExterminator.exterminate(list);
        System.out.println(oddNumbersExterminator.getListEven());
    }
}
