package com.frezer;

public class Main {

    public static void main(String[] args) {


                double e = 1.0;
                double item = 1.0;
                for (int i = 2; i <= 100000; i++) {
                    item /= (double)i;
                    e += item;
                    if (i % 10000 == 0) {
                        System.out.println("i is " + i + " and e is " + e);
                    }
                }
            }

        }

