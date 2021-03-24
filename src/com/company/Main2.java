package com.company;

public class Main2 {

    public static void main (String[] args) {

        int prevPrevVal = 0;
        int prevVal = 1;
        int currVal;
        System.out.println(prevPrevVal);
        System.out.println(prevVal);

        do {
            currVal = prevVal + prevPrevVal;
            System.out.println(currVal);

            prevPrevVal = prevVal;
            prevVal = currVal;
        } while (prevVal+prevPrevVal <= 100);

    }
}