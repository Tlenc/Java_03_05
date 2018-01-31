package com.company;

import java.util.Scanner;

public class Main {
    static int[] mas = new int[5];
    static int suma = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite skaičių");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
            suma += mas[i];
        }
        System.out.println("suma :" + isvestis());
    }

    public static int isvestis() {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);


        }
        return suma;
    }
}
