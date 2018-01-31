package com.company;

import java.util.Scanner;

public class Main {
    public String[] masyvas;

    public void zodziuIrasymas() {
        Scanner sc = new Scanner(System.in);

        masyvas = new String[5];

        System.out.println("Irasyk penkis zodzius: ");

        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = sc.next();

        }
    }

    public void zodziuparodymas() {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }

    public static void main (String[]args){
        Main objektas = new Main();
        objektas.zodziuIrasymas();
        objektas.zodziuparodymas();
    }
}
