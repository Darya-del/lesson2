package com.company;

public class Main2 {

    public static void main (String[] args) {

        int a = 0;
        int b = 1;
        int res;
        System.out.println(a);
        System.out.println(b);

        do {
            res = b + a;
            System.out.println(res);

            a = b;
            b = res;
        } while (b+a <= 100);

    }
}