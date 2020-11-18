package com.daw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0, cont = 0;
        int max = 50;
        int min = 10;
        int x = (int)(500*Math.random());
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n Introduce el valor de X:");
            n = sc.nextInt();
            if(n > x) {
                System.out.println("Te pasaste my friend");
            } else if(n < x) {
                System.out.println("Estuviste cerca my friend...");
            }
            cont++;
        } while(n != x);
        System.out.println("Ouh yeah! Acertaste! Aunque después de " + cont + " intentos, not bad :)");
        sc.close();
    }
}
